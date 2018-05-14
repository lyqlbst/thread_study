package thread._2_concurrency._2_synchronized_code_blocks_part.use;

class ThreadA extends Thread {
    private ObjectService service;

    ThreadA(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
