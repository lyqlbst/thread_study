package thread._3_communication._1_wait_and_notify._11_producer_consumer._1_p_c_operate_value;

/**
 * 本示例是1个生产者和1个消费者进行数据的交互，在控制台中打印的日志get和set是交替运行的。
 * 但如果在此实验的基础上，设计出多个生产者和多个消费者，那么在运行的过程中极有可能出现“假死”的情况，
 * 也就是所有的线程都呈WAITING等待状态。
 */
class MyMain {

    public static void main(String[] args) {
        String lock = new String();
        P p = new P(lock);
        C c = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(c);
        pThread.start();
        cThread.start();
    }
}
