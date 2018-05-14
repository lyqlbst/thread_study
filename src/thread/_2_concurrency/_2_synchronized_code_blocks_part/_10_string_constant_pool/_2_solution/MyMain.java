package thread._2_concurrency._2_synchronized_code_blocks_part._10_string_constant_pool._2_solution;

/**
 * 交替打印的原因是持有的锁不是一个
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("AA");
        ThreadB b = new ThreadB(service);
        b.setName("BB");
        a.start();
        b.start();
    }
}
