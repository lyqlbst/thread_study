package thread._3_communication._1_wait_and_notify._11_producer_consumer._4_p_c_operate_stack;

/**
 * 本示例是使生产者向堆栈List对象中放入数据，使消费者从List堆栈中取出数据。List最大容量是1，
 * 实验环境只有一个生产者与一个消费者。
 * 程序运行结果是size()不会大于1，通过使用生产者/消费者模式，容器size()的值不会大于1，也是本示例想要实现的效果，
 * 值在0和1之间进行交替，也就是生产和消费这两个过程在交替执行。
 */
class MyMain {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        P_Thread pThread = new P_Thread(p);
        C_Thread cThread = new C_Thread(c);
        pThread.start();
        cThread.start();
    }
}
