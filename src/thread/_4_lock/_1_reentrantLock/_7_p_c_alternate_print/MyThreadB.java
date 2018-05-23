package thread._4_lock._1_reentrantLock._7_p_c_alternate_print;

class MyThreadB extends Thread {
    private MyService service;

    MyThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) service.get();
    }
}
