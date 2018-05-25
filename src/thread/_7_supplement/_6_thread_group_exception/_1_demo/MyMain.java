package thread._7_supplement._6_thread_group_exception._1_demo;

/**
 * 程序运行后，其中一个线程出现异常，但其他线程却一直以死循环的方式持续打印的结果。
 * 红色按钮变成灰色是因为被用鼠标强制停止，而while(true)死循环是无限输出的。
 * 从运行的结果来看，在默认的情况下，线程组中的一个线程出现异常不会影响其他线程的运行。
 * 如果想实现线程组内一个线程出现异常后全部线程都停止运行该如何实现呢？
 */
class MyMain {

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("我的线程组");
        MyThread[] threads = new MyThread[10];
        for (int i = 0; i < threads.length; i++) threads[i] = new MyThread(group, "线程" + (i + 1), "1");
        for (MyThread thread : threads) thread.start();
        MyThread newT = new MyThread(group, "报错线程", "a");
        newT.start();
    }
}
