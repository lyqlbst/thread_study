package thread._3_communication._1_wait_and_notify._8_wait_long;

/**
 * 带一个参数的wait(long)方法的功能是等待某一时间内是否有线程对锁进行唤醒，如果超过这个时间则自动唤醒。
 * 运行结果：3秒后被自动唤醒。
 */
class MyRunnable1 {
    private static Object lock = new Object();
    private static Runnable runnable = () -> {
        synchronized (lock) {
            System.out.println("wait begin timer=" + System.currentTimeMillis());
            try {
                lock.wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait end timer=" + System.currentTimeMillis());
        }
    };

    public static void main(String[] args) {
        Thread t = new Thread(runnable);
        t.start();
    }
}
