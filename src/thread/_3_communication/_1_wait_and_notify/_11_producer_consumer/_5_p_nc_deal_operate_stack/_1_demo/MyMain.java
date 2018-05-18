package thread._3_communication._1_wait_and_notify._11_producer_consumer._5_p_nc_deal_operate_stack._1_demo;

/**
 * 本示例是使用一个生产者向堆栈List对象中放入数据，而多个消费者从List堆栈中取出数据。List最大容量还是1。
 * 程序运行后在某些几率下出现异常，此问题的出现就是因为在MyStack.java类中使用了if语句作为条件判断，
 * 因为条件发生改变时并没有得到及时的相应，所以多个呈wait状态的线程被唤醒，继而执行list.remove(0)代码而出现异常。
 * 解决这个的办法就是if改成while。
 */
class MyMain {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C_Thread[] cThreads = new C_Thread[5];
        for (int i = 0; i < 5; i++) cThreads[i] = new C_Thread(new C(myStack));
        P_Thread pThread = new P_Thread(p);
        pThread.start();
        for (C_Thread cThread : cThreads) cThread.start();
    }
}
