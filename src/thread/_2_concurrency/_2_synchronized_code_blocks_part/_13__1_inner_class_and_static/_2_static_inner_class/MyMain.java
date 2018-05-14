package thread._2_concurrency._2_synchronized_code_blocks_part._13__1_inner_class_and_static._2_static_inner_class;

import static thread._2_concurrency._2_synchronized_code_blocks_part._13__1_inner_class_and_static._2_static_inner_class.PublicClass.*;

/**
 * 内置类还有一种叫做静态内置类。
 */
class MyMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUserName("userNameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUserName() + " " + publicClass.getPassword());
        PrivateClass privateClass = new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
    }
}
