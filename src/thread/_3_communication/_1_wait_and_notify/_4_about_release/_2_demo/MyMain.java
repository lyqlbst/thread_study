package thread._3_communication._1_wait_and_notify._4_about_release._2_demo;

/**
 * 方法notify()被执行后，不释放锁。
 * 运行结果：方法notify()被执行后不释放锁
 * 此实验说明，必须执行完notify()方法所在的同步synchronized代码块后才释放锁。
 */
class MyMain {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NotifyThread notifyThread = new NotifyThread(lock);
        SynNotifyMethodThread c = new SynNotifyMethodThread(lock);
        a.start();
        notifyThread.start();
        c.start();
    }
}
