package thread._7_supplement._6_thread_group_exception._2_demo;

/**
 * 需要主要的是，使用自定义java.lang.ThreadGroup线程组，并且重写uncaughtException方法处理组内线程中断行为时，
 * 每个线程对象中的run()方法内部不要有异常catch语句，如果有catch语句，
 * 则 public void uncaughtException(Thread t, Throwable e) 方法不执行。
 * 程序运行后，其中一个线程出现异常，其他的线程全部停止了。
 */
class MyMain {

    public static void main(String[] args) {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread[] threads = new MyThread[10];
        for (int i = 0; i < threads.length; i++) threads[i] = new MyThread(group, "线程" + (i + 1), "1");
        for (MyThread thread : threads) thread.start();
        MyThread newT = new MyThread(group, "报错线程", "a");
        newT.start();
    }
}
