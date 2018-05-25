package thread._7_supplement._2_thread_group._1_one_level_relation;

/**
 * 所谓的一级关联就是父对象中有子对象，但并不创建子孙对象。这种情况经常出现在开发中，比如创建一些线程时，
 * 为了有效地对这些线程进行组织管理，通常的情况下是创建一个线程组，然后再将部分线程归属到该组中。
 * 这样的处理可以对零散的线程对象进行有效的组织与规划。
 * 控制台中打印的信息表示线程组有两个线程，并且打印出了线程组的名称。另外，两个线程一直无限地并且每隔1秒打印日志。
 */
class MyMain {

    public static void main(String[] args) {
        ThreadA aRunnable = new ThreadA();
        ThreadB bRunnable = new ThreadB();
        ThreadGroup group = new ThreadGroup("林宇强的线程组");
        Thread aThread = new Thread(group, aRunnable);
        Thread bThread = new Thread(group, bRunnable);
        aThread.start();
        bThread.start();
        System.out.println("活动的线程数为：" + group.activeCount());
        System.out.println("线程组的名称为：" + group.getName());
    }
}
