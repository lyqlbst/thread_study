package thread._6_singleton._7_enum_perfect;

/**
 * 前面示例将枚举类进行暴露，违反了“职责单一原则”，在下面的示例中进行完善。
 * 程序运行结果：成功实现单例模式
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread();
        for (int i = 0; i < 5; i++) threads[i].start();
    }
}
