package thread._3_communication._1_wait_and_notify._11_producer_consumer._6_np_c_operate_stack;

/**
 * 本示例是使用生产者向堆栈List对象中放入数据，使用消费者从List堆栈中取出数据。List最大容量还是1，
 * 实验环境是多个生产者与一个消费者。
 */
class MyMain {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        C c = new C(myStack);
        P_Thread[] pThreads = new P_Thread[5];
        for (int i = 0; i < 5; i++) pThreads[i] = new P_Thread(new P(myStack));
        C_Thread cThread = new C_Thread(c);
        cThread.start();
        for (P_Thread pThread : pThreads) pThread.start();
    }
}
