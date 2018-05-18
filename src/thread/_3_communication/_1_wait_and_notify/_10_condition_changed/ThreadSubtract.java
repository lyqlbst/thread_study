package thread._3_communication._1_wait_and_notify._10_condition_changed;

class ThreadSubtract extends Thread {
    private Subtract r;

    ThreadSubtract(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
