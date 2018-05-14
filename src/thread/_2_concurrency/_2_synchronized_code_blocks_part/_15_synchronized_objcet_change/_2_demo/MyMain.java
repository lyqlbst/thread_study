package thread._2_concurrency._2_synchronized_code_blocks_part._15_synchronized_objcet_change._2_demo;

class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        UserInfo userInfo = new UserInfo();
        ThreadA a = new ThreadA(service, userInfo);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service, userInfo);
        b.setName("b");
        b.start();
    }
}
