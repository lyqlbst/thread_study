package thread._4_lock._2_reentrantReadWriteLock._1_read_read_share;

/**
 * 从控制台打印的时间来看，两个线程几乎同时进入lock()方法后面的代码。
 * 说明在此使用了lock.readLock()读锁可以提高程序运行效率，允许多个线程同时执行lock()方法后面的代码。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
