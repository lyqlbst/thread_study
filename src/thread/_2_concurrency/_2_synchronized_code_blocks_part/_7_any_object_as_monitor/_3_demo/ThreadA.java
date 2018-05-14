package thread._2_concurrency._2_synchronized_code_blocks_part._7_any_object_as_monitor._3_demo;

class ThreadA extends Thread {
    private Service service;

    ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.a();
    }
}
