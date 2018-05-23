package thread._4_lock._1_reentrantLock._15_awaitUntil;

class MyThreadB extends Thread {
    private Service service;

    MyThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
