package thread.concurrency.synchronized_code_bock_part.use;

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
