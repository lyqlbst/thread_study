package thread._7_supplement._1_thread_state._1_verify_new_runnable_terminated;

/**
 * 下面使用代码的方式验证线程所有的状态值，了解线程的状态有助于程序员监控线程对象所处的情况，比如哪些线程从未启动，
 * 哪些线程正在阻塞，哪些线程正在等待，哪些线程已经销毁了，等等。这些是与线程生命周期相关的信息。
 * 首先验证的是NEW、RUNNABLE、TERMINATED状态，NEW状态是线程实例化后还从未执行start()方法时的状态，
 * 而RUNNABLE状态是线程进入运行的状态，TERMINATED是线程被销毁时的状态。
 * 程序运行结果：正确打印
 * 注意！构造方法打印出的日志其实是显示main主线程的状态为RUNNABLE。
 */
class MyMain {

    // NEW,
    // RUNNABLE,
    // TERMINATED,
    // BLOCKED,
    // WAITING,
    // TIMED_WAITING
    public static void main(String[] args) {
        MyThread t = new MyThread();
        System.out.println("main方法中的状态1：" + t.getState());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main方法中的状态2：" + t.getState());
    }
}
