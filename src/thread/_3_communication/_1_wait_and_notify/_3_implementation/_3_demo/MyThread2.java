package thread._3_communication._1_wait_and_notify._3_implementation._3_demo;

class MyThread2 extends Thread {
    private Object lock;

    MyThread2(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始  notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束  notify time=" + System.currentTimeMillis());
        }
    }
}
