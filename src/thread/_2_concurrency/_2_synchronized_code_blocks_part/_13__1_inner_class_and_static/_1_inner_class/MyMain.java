package thread._2_concurrency._2_synchronized_code_blocks_part._13__1_inner_class_and_static._1_inner_class;

import static thread._2_concurrency._2_synchronized_code_blocks_part._13__1_inner_class_and_static._1_inner_class.PublicClass.*;

/**
 * 关键字synchronized的知识点还涉及内置类的使用。
 * 如果PublicClass.java类和MyMain.java类不在同一个包中，则需要将PrivateClass内置声明成public公开的。
 */
class MyMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUserName("userNameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUserName() + " " + publicClass.getPassword());
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
    }
}
