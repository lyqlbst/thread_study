package thread._4_lock._1_reentrantLock._5_multi_condition_wrong_use;

class ThreadA extends Thread {
    private MyService service;

    ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
