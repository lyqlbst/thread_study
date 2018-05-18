package thread._3_communication._1_wait_and_notify._11_producer_consumer._2_np_nc_false_dead;

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
