package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo_1;

class ThreadA extends Thread {
    private Service service;

    ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUserNamePassword("a", "aa");
    }
}
