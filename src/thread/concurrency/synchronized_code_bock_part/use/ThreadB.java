package thread.concurrency.synchronized_code_bock_part.use;

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
