package thread._3_communication._1_wait_and_notify._11_producer_consumer._7_np_nc_operate_stack;

/**
 * 本示例是使用生产者向栈List对象中放入数据，使用消费者从List栈中去取出数据。List最大容量是1，
 * 实验环境是多个生产者与多个消费者。
 * 从程序的运行结果来看，list对象的size()并没有超过1。
 */
class MyMain {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P_Thread[] pThreads = new P_Thread[5];
        for (int i = 0; i < 5; i++) pThreads[i] = new P_Thread(new P(myStack));
        C_Thread[] cThreads = new C_Thread[5];
        for (int i = 0; i < 5; i++) cThreads[i] = new C_Thread(new C(myStack));
        for (int i = 0; i < 5; i++) {
            pThreads[i].start();
            cThreads[i].start();
        }
    }
}
