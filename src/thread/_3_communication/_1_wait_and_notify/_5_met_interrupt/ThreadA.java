package thread._3_communication._1_wait_and_notify._5_met_interrupt;

class ThreadA extends Thread {
    private Object lock;

    ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
