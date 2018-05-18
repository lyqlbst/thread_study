package thread._3_communication._1_wait_and_notify._4_about_release._1_demo;

class ThreadB extends java.lang.Thread {
    private Object lock;

    ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
