package thread._4_lock._1_reentrantLock._14_awaitUninterruptibly;

class MyThread extends Thread {
    private Service service;

    MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
