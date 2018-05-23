package thread._4_lock._1_reentrantLock._5_multi_condition_wrong_use;

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
