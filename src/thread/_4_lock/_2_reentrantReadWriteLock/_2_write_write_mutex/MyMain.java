package thread._4_lock._2_reentrantReadWriteLock._2_write_write_mutex;

/**
 * 使用写锁代码lock.writeLock()的效果就是同一时间只允许一个线程执行lock()方法后面的代码。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("AA");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("BB");
        b.start();
    }
}
