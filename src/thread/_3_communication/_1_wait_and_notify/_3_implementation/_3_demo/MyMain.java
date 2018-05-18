package thread._3_communication._1_wait_and_notify._3_implementation._3_demo;

/**
 * 从控制台打印的结果来看，0.5秒后线程被notify通知唤醒。
 */
class MyMain {

    public static void main(String[] args) {
        Object lock = new Object();
        MyThread1 t1 = new MyThread1(lock);
        MyThread2 t2 = new MyThread2(lock);
        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
