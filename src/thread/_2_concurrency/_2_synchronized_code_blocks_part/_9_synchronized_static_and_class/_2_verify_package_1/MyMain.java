package thread._2_concurrency._2_synchronized_code_blocks_part._9_synchronized_static_and_class._2_verify_package_1;

/**
 *异步的原因是持有不同的锁，一个是对象锁，另外一个是Class锁，而Class锁可以对类的所有对象实例起作用。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        ThreadB b = new ThreadB(service);
        a.setName("b");
        ThreadC c = new ThreadC(service);
        a.setName("c");
        a.start();
        b.start();
        c.start();
    }
}
