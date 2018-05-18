package thread._3_communication._1_wait_and_notify._11_producer_consumer._5_p_nc_deal_operate_stack._1_demo;

class C_Thread extends Thread {
    private C c;

    C_Thread(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) c.popService();
    }
}
