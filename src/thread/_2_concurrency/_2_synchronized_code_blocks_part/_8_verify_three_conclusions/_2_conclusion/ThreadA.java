package thread._2_concurrency._2_synchronized_code_blocks_part.verify_three_conclusions.conclusion_2;

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
