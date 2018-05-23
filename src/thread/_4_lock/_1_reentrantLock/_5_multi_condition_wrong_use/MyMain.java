package thread._4_lock._1_reentrantLock._5_multi_condition_wrong_use;

/**
 * 前面的包使用一个Condition对象来实现等待/通知模式，其实Condition对象也可以创建多个。
 * 那么一个Condition对象和多个Condition对象在使用上有什么区别呢？
 * 程序运行结果：线程A和B都被唤醒。
 * 如果想单独唤醒部分线程改怎么处理呢？这时就有必要使用多个Condition对象了，页就是Condition对象可以唤醒部分指定线程，
 * 有助于提升程序运行的效率。可以先对线程进行分组，然后再唤醒指定组中的线程。
 */
class MyMain {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.signalAll();
    }
}
