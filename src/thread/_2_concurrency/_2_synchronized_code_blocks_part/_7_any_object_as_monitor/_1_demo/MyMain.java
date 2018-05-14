package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo_1;

/**
 * 锁非this对象具有一定的优点，如果在一个类中有很多个synchronized方法，这时虽然能实现同步，
 * 但对受到阻塞，所以影响运行效率，但如果使用同步代码块锁非this对象，则synchronized(非this)
 * 代码块中的程序与同步方法是异步的，不与其他锁this同步方法争抢this锁，则可以大大提高运行效率。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
