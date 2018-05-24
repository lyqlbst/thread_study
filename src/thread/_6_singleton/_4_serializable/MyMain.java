package thread._6_singleton._4_serializable;

import java.io.*;

/**
 * 静态内置类可以达到线程安全问题，但如果遇到序列化对象时，使用默认的方式运行得到的结果还是多例的。
 * 程序运行结果：不同的hashCode，不是一个对象
 * 解决办法就是在反序列化中使用readResolve()方法。
 * 去掉MyObject中的代码注释即可：
 * Object readResolve() throws ObjectStreamException {
 *     System.out.println("调用了readResolve方法");
 *     return MyObjectHandler.myObject;
 * }
 * 程序运行结果：相同的hashCode，一个对象
 */
class MyMain {

    public static void main(String[] args) {
        try (FileOutputStream fosRef = new FileOutputStream(new File("myObjectFile.txt"))) {
            MyObject myObject = MyObject.getInstance();
            ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
            oosRef.writeObject(myObject);
            oosRef.close();
            System.out.println(myObject.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fisRef = new FileInputStream(new File("myObjectFile.txt"))) {
            ObjectInputStream oisRef = new ObjectInputStream(fisRef);
            MyObject myObject = (MyObject) oisRef.readObject();
            oisRef.close();
            System.out.println(myObject.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
