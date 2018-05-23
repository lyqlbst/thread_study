package thread._4_lock._1_reentrantLock._6_multi_condition_right_use;

class ThreadB extends Thread {
    private MyService service;

    ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
