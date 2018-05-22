package thread._3_communication._2_join._5_join_sleep_dif._2_demo;

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
                b.join();   // 说明join释放锁了！
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
        }
    }
}
