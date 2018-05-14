package thread._2_concurrency._2_synchronized_code_blocks_part._8_verify_three_conclusions._3_conclusion;

class ThreadB extends Thread {
    private Service service;
    private MyObject object;

    ThreadB(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
