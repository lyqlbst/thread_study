package thread._2_concurrency._2_synchronized_code_blocks_part._9_synchronized_static_and_class._3_verify_package_2;

/**
 * 虽然是不同对象但静态的同步方法还是同步运行。
 */
class MyMain {

    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA a = new ThreadA(service1);
        a.setName("a");
        ThreadB b = new ThreadB(service2);
        b.setName("b");
        a.start();
        b.start();
    }
}
