package thread._2_concurrency._2_synchronized_code_blocks_part.verify_three_conclusions.conclusion_2;

/**
 * 运行结果是同步的。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service, object);
        b.setName("b");
        b.start();
    }
}
