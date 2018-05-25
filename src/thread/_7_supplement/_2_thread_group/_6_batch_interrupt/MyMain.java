package thread._7_supplement._2_thread_group._6_batch_interrupt;

/**
 * 通过将线程归属到线程组中，当调用线程组ThreadGroup的interrupt()方法时，可以将该组中的所有正在运行的线程批量停止。
 */
class MyMain {

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("我的线程组");
        for (int i = 0; i < 5; i++) new MyThread(group, "线程" + (i + 1)).start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("停了停了！");
        }
        group.interrupt();
        System.out.println("调用了interrupt()方法");
    }
}
