package thread._3_communication._1_wait_and_notify._6_notify_only_one;

class ThreadC extends Thread {
    private Object lock;

    ThreadC(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
