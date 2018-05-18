package thread._3_communication._1_wait_and_notify._3_implementation._4_demo;

class ThreadA extends Thread {
    private Object lock;

    ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            if (MyList.size() != 5) {
                System.out.println("wait begin " + System.currentTimeMillis());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait end " + System.currentTimeMillis());
            }
        }
    }
}
