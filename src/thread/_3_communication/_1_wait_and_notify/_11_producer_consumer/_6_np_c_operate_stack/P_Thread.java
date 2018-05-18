package thread._3_communication._1_wait_and_notify._11_producer_consumer._6_np_c_operate_stack;

class P_Thread extends Thread {
    private P p;

    P_Thread(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true) p.pushService();
    }
}
