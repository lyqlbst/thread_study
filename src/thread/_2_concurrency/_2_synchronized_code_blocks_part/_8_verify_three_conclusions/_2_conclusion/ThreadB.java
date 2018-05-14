package thread._2_concurrency._2_synchronized_code_blocks_part.verify_three_conclusions.conclusion_2;

class ThreadB extends java.lang.Thread {
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
