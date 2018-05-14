package thread._2_concurrency._2_synchronized_code_blocks_part._15_synchronized_objcet_change._2_demo;

class ThreadB extends Thread {
    private Service service;
    private UserInfo userInfo;

    ThreadB(Service service, UserInfo userInfo) {
        super();
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userInfo);
    }
}
