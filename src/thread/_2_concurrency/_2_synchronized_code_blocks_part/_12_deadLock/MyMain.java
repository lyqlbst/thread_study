package thread._2_concurrency._2_synchronized_code_blocks_part._12_deadLock;

/**
 * Java线程死锁是一个经典的多线程问题，因为不同的线程都在等待根本不可能被释放的锁，
 * 进而导致所有的任务都无法继续完成。在多线程技术中，“死锁”是必须避免的，因为这样会造成线程“假死”。
 *
 * 可以使用JDK自带的工具来检测是否有死锁的现象。
 * 首先进入cmd工具，再进入JDK的安装文件夹中的bin目录，执行jps(jps)：
 * * * * * * * * *
 * * 1852 Jps    *
 * * 3352        *
 * * 3244 MyMain *
 * * * * * * * * *
 * 得到运行线程MyMain的id值是3224。再执行jstack命令，查看结果(jstack -l 3244)：
 * 略……
 * 检测出有死锁现象。
 *
 * 死锁是程序设计的Bug，再设计程序时就要避免双方互相持有对方的锁的情况。需要说明的是，
 * 本实验使用synchronized嵌套的代码结构来实现死锁，其实不使用嵌套的代码结构也会出现死锁，
 * 与嵌套不嵌套没有任何的关系，不要被代码的结构所误导。只要相互等待对方释放锁就有可能出现死锁。
 */
class MyMain {

    public static void main(String[] args) {
        DealThread t1 = new DealThread();
        t1.setFlag("a");
        Thread thread1 = new Thread(t1);
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(t1);
        t1.setFlag("b");
        thread2.start();
    }
}
