package thread._2_concurrency._2_synchronized_code_blocks_part.use;

class ThreadB extends Thread {
    private ObjectService service;

    ThreadB(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
