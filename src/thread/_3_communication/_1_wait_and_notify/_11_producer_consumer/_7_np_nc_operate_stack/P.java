package thread._3_communication._1_wait_and_notify._11_producer_consumer._7_np_nc_operate_stack;

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
