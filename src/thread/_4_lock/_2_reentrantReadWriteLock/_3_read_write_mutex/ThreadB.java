package thread._4_lock._2_reentrantReadWriteLock._3_read_write_mutex;

class ThreadB extends Thread {
    private Service service;

    ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
