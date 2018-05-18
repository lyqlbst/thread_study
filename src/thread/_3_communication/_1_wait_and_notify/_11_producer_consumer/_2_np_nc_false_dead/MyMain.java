package thread._3_communication._1_wait_and_notify._11_producer_consumer._2_np_nc_false_dead;

/**
 * “假死”的现象其实就是线程全部进入WAITING等待状态。如果全部线程都进入WAITING状态，
 * 则程序就不再执行任何业务功能了，整个项目呈停止状态。这在使用生产者与消费者模式时经常遇到。
 * 程序运行后很有可能出现假死状态。
 */
class MyMain {

    public static void main(String[] args) {
        String lock = new String();
        P p = new P(lock);
        C c = new C(lock);
        ThreadP[] pThreads = new ThreadP[2];
        ThreadC[] cThreads = new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            pThreads[i] = new ThreadP(p);
            pThreads[i].setName("生产者" + (i + 1));
            cThreads[i] = new ThreadC(c);
            cThreads[i].setName("消费者" + (i + 1));
            pThreads[i].start();
            cThreads[i].start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0, length = threads.length; i < length; i++)
            System.out.println(threads[i].getName() + " " + threads[i].getState());
    }
}
