package thread._4_lock._1_reentrantLock._4_condition_right_use;

class ThreadA extends Thread {
    private MyService service;

    ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
