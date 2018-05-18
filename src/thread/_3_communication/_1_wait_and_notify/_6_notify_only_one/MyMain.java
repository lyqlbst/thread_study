package thread._3_communication._1_wait_and_notify._6_notify_only_one;

/**
 *调用notify()一次只随机通知一个线程进行唤醒。
 * 运行结果：notify()仅随机唤醒一个线程。
 * 当多次调用notify()方法时，会随机将等待wait状态的线程唤醒。
 * 更改NotifyThread代码如下：
 * ……
 * synchronized(lock){
 *     lock.notify();
 *     lock.notify();
 *     lock.notify();
 * }
 * ……
 * 多次调用notify()方法唤醒了全部WAITING中的线程。
 */
class MyMain {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        ThreadB b = new ThreadB(lock);
        ThreadC c = new ThreadC(lock);
        NotifyThread notifyThread = new NotifyThread(lock);
        a.start();
        b.start();
        c.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyThread.start();
    }
}
