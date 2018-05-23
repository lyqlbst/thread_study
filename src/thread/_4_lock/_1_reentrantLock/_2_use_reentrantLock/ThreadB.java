package thread._4_lock._1_reentrantLock._2_use_reentrantLock;

class ThreadB extends Thread {
    private MyService service;

    ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
