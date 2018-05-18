package thread._3_communication._1_wait_and_notify._6_notify_only_one;

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
