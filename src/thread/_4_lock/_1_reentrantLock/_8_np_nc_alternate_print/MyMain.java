package thread._4_lock._1_reentrantLock._8_np_nc_alternate_print;

/**
 * 程序运行结果：出现假死
 * 根据第3个包中的notifyAll()解决方案，可以使用signalAll()方法来解决。
 * 将MyService.java类中的两处signal()代码改成signalAll()后，程序得到正确运行。
 * 从控制台打印的日志可以发现，运行后不在出现假死状态，假死问题被解决了。
 * 控制台中“打印★”和“打印☆”是交替输出的，但是“有可能★★连续”和“有可能☆☆连续”却不是交替输出的，
 * 有时候出现连续打印的情况。原因是程序中使用了一个Condition对象，再结合signalAll()方法来唤醒所有的线程，
 * 那么唤醒的线程就有可能是同类，所以就出现连续打印“有可能★★连续”和“有可能☆☆连续”的情况了。
 */
class MyMain {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA[] threadAs = new MyThreadA[10];
        MyThreadB[] threadBs = new MyThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadAs[i] = new MyThreadA(service);
            threadBs[i] = new MyThreadB(service);
            threadAs[i].start();
            threadBs[i].start();
        }
    }
}
