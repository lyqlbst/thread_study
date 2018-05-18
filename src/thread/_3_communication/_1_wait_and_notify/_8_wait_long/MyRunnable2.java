package thread._3_communication._1_wait_and_notify._8_wait_long;

/**
 * 程序也可以在5秒内由其他线程唤醒。
 * 运行结果：1秒后t1线程被t2线程的notify()方法唤醒。
 */
class MyRunnable2 {
    private static Object lock = new Object();
    private static Runnable runnable1 = () -> {
        synchronized (lock) {
            System.out.println("wait begin timer=" + System.currentTimeMillis());
            try {
                lock.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait end timer=" + System.currentTimeMillis());
        }
    };

    private static Runnable runnable2 = () -> {
        synchronized (lock) {
            System.out.println("notify begin timer=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("notify end timer=" + System.currentTimeMillis());
        }
    };

    public static void main(String[] args) {
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
