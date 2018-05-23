package thread._4_lock._1_reentrantLock._2_use_reentrantLock;

class ThreadA extends Thread {
    private MyService service;

    ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
