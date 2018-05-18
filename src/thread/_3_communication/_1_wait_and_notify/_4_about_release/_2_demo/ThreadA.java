package thread._3_communication._1_wait_and_notify._4_about_release._2_demo;

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
