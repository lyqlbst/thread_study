package thread._2_concurrency._2_synchronized_code_blocks_part.verify_three_conclusions.conclusion_1;

/**
 * 若果使用不同的“对象监视器”，则表现为异步。
 */
class MyMain2 {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();
        ThreadA a = new ThreadA(service, object1);
        a.setName("a");
        ThreadB b = new ThreadB(service, object2);
        b.setName("b");
        a.start();
        b.start();
    }
}
