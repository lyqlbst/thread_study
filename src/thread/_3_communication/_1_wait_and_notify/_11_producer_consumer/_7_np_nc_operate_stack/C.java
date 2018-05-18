package thread._3_communication._1_wait_and_notify._11_producer_consumer._7_np_nc_operate_stack;

class C {
    private MyStack myStack;

    C(MyStack myStack) {
        super();
        this.myStack = myStack;
    }

    void popService() {
        myStack.pop();
    }
}
