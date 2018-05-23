package thread._4_lock._2_reentrantReadWriteLock._4_write_read_mutex;

/**
 * 从控制台中打印的结果来看，“写读”操作也是互斥的。
 * “读写”、“写读”和“写写”都是互斥的；而“读读”是异步的，非互斥的。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
    }
}
