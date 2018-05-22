package thread._3_communication._2_join._5_join_sleep_dif._1_demo;

/**
 * 方法join(long)的功能在内部是使用wait(long)方法来实现的，所以join(long)方法具有释放锁的特点。
 * 当执行wait(long)方法后，当前线程的锁被释放，那么其他线程就可以调用此线程中的同步方法了。
 * 而Thread.sleep(long)方法却不释放锁。
 * 运行结果：ThreadA不释放ThreadB的锁
 * 由于线程ThreadA使用Thread.sleep(long)方法一直持有ThreadB对象的锁，时间达到6秒，
 * 所以线程ThreadC只有在ThreadA时间到达6秒后释放ThreadB的锁时，
 * 才可以调用ThreadB中的同步方法synchronized void bService()。
 *
 */
class MyMain {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        ThreadC c = new ThreadC(b);
        a.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.start();
    }
}
