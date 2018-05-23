package thread._4_lock._2_reentrantReadWriteLock._4_write_read_mutex;

class ThreadA extends Thread {
    private Service service;

    ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
