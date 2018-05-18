package thread._3_communication._1_wait_and_notify._11_producer_consumer._5_p_nc_deal_operate_stack._2_demo;

class P {
    private MyStack myStack;

    P(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    void pushService() {
        myStack.push();
    }
}
