package thread._3_communication._1_wait_and_notify._11_producer_consumer._5_p_nc_deal_operate_stack._2_demo;

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
