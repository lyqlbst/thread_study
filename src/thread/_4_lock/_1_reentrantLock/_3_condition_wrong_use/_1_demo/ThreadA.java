package thread._4_lock._1_reentrantLock._3_condition_wrong_use._1_demo;

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
