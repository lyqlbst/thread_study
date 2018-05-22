package thread._3_communication._2_join._5_join_sleep_dif._1_demo;

class ThreadC extends Thread {
    private ThreadB b;

    ThreadC(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        b.bService();
    }
}
