package thread._2_concurrency._2_synchronized_code_blocks_part._8_verify_three_conclusions._1_conclusion;

class ThreadA extends Thread {
    private Service service;
    private MyObject object;

    ThreadA(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
