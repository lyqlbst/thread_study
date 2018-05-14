package thread._2_concurrency._2_synchronized_code_blocks_part.verify_three_conclusions.conclusion_1;

/**
 * 同步的原因是使用了同一个“对象监视器”。
 */
class MyMain1 {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service, object);
        a.setName("a");
        ThreadB b = new ThreadB(service, object);
        b.setName("b");
        a.start();
        b.start();
    }
}
