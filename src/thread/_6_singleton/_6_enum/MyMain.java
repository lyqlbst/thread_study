package thread._6_singleton._6_enum;

/**
 * 枚举enum和静态代码块的特性相似，在使用枚举类时，构造方法会被自动调出，也可以应用其这个特性实现单例设计模式。
 * 程序运行结果：5个线程一个hashCode，创建了一个对象
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread();
        for (int i = 0; i < 5; i++) threads[i].start();
    }
}
