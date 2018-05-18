package thread._3_communication._1_wait_and_notify._10_condition_changed;

class ThreadAdd extends Thread {
    private Add p;

    ThreadAdd(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
