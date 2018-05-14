package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo_3;

class ThreadB extends Thread {
    private Service service;

    ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.b();
    }
}
