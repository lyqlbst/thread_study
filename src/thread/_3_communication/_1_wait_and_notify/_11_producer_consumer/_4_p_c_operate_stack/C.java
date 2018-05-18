package thread._3_communication._1_wait_and_notify._11_producer_consumer._4_p_c_operate_stack;

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
