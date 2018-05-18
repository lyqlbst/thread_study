package thread._3_communication._1_wait_and_notify._4_about_release._1_demo;

/**
 * 当方法wait()被执行后，锁被自动释放，但执行完notify()方法，锁却不自动释放。
 * 程序运行效果：方法wait()自动释放锁。
 * 如果将wait()方法改成sleep()方法，就成了同步效果，sleep方法不释放锁。
 */
class MyMain {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        ThreadB b = new ThreadB(lock);
        a.start();
        b.start();
    }
}
