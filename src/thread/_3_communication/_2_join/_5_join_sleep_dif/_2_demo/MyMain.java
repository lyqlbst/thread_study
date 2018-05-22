package thread._3_communication._2_join._5_join_sleep_dif._2_demo;

/**
 * 改变ThreadA.java类的代码
 * 程序运行结果：方法join()释放锁
 * 由于线程ThreadA释放了ThreadB中的锁，所以线程ThreadC可以调用ThreadB中的同步方法synchronized void bService()。
 * 此实验页再次说明join(long)方法具有释放锁的特点。
 *
 */
class MyMain {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        ThreadC c = new ThreadC(b);
        a.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.start();
    }
}
