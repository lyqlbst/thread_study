package thread._4_lock._1_reentrantLock._2_use_reentrantLock;

class ThreadBB extends Thread {
    private MyService service;

    ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
