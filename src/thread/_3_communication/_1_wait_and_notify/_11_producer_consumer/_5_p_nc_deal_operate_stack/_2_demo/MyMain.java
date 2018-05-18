package thread._3_communication._1_wait_and_notify._11_producer_consumer._5_p_nc_deal_operate_stack._2_demo;

/**
 * 运行项目没有出现执行异常，却出现了“假死”情况，解决办法是换用notifyAll()方法。
 */
class MyMain {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        C_Thread[] cThreads = new C_Thread[5];
        P p = new P(myStack);
        for (int i = 0; i < 5; i++) cThreads[i] = new C_Thread(new C(myStack));
        P_Thread pThread = new P_Thread(p);
        pThread.start();
        for (C_Thread cThread : cThreads) cThread.start();
    }
}
