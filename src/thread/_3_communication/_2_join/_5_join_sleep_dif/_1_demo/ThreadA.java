package thread._3_communication._2_join._5_join_sleep_dif._1_demo;

class ThreadA extends Thread {
    private ThreadB b;

    ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (b) {
            b.start();
            try {
                ThreadB.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Thread.sleep();不释放锁！
        }
    }
}
