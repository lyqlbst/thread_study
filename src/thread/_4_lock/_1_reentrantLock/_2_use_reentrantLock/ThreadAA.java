package thread._4_lock._1_reentrantLock._2_use_reentrantLock;

class ThreadAA extends Thread {
    private MyService service;

    ThreadAA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
