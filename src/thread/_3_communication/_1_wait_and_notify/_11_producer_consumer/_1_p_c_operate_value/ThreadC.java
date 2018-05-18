package thread._3_communication._1_wait_and_notify._11_producer_consumer._1_p_c_operate_value;

class ThreadC extends Thread {
    private C c;

    ThreadC(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) c.getValue();
    }
}
