package thread._3_communication._1_wait_and_notify._11_producer_consumer._1_p_c_operate_value;

class ThreadP extends Thread {
    private P p;

    ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) p.setValue();
    }
}
