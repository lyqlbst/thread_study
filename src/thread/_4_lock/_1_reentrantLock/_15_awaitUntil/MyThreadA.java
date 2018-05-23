package thread._4_lock._1_reentrantLock._15_awaitUntil;

class MyThreadA extends Thread {
    private Service service;

    MyThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
