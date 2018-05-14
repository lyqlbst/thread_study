package thread._2_concurrency._2_synchronized_code_blocks_part._15_synchronized_objcet_change._1_demo;

class ThreadB extends Thread {
    private MyService service;

    ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
