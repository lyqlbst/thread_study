package thread._4_lock._2_reentrantReadWriteLock._1_read_read_share;

class ThreadB extends Thread {
    private Service service;

    ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
