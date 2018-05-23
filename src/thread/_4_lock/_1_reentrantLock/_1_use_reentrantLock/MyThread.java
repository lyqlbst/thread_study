package thread._4_lock._1_reentrantLock._1_use_reentrantLock;

class MyThread extends Thread {
    private MyService service;

    MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
