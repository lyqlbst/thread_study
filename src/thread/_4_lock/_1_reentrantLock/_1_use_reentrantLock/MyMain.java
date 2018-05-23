package thread._4_lock._1_reentrantLock._1_use_reentrantLock;

/**
 * 既然ReentrantLock类在功能上相比synchronized更多，那么就以一个初步的程序示例来介绍一下ReentrantLock类的使用。
 * 程序运行结果：同步运行
 * 从运行的结果来看，当前线程打印完毕之后将锁进行释放，其他线程才可以继续打印。线程打印的数据是分组打印，
 * 因为当前线程已经持有锁，但线程之间打印的顺序是随机的。
 */
class MyMain {

    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread(service);
        for (int i = 0; i < 5; i++) threads[i].start();
    }
}
