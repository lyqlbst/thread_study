package thread._4_lock._2_reentrantReadWriteLock._3_read_write_mutex;

/**
 * 程序运行结果：先获得读锁，1秒后，再获得写锁
 * 此实验说明“读写”操作是互斥的，而且下一个示例说明“写读”操作也是互斥的。即只要出现“写操作”的过程，就是互斥的。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
