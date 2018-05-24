package thread._6_singleton._3_static_inner_class;

/**
 * DCL可以解决多线程单例模式的非线程安全问题。当然，使用其他的办法也能达到同样的效果。
 * 程序运行结果：5个线程一个hashCode，一个对象。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread();
        for (int i = 0; i < 5; i++) threads[i].start();
    }
}
