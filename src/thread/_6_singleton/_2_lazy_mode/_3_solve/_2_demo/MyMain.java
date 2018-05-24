package thread._6_singleton._2_lazy_mode._3_solve._2_demo;

/**
 * 尝试同步代码块
 * 同步方法是对方法的整体进行持锁，这样对运行效率来讲是不利的。
 * 程序运行结果：5个线程相同的hashCode
 * 此方法加入同步synchronized语句块得到相同实例的对象，但此种方法的运行效率也是非常低的，
 * 和synchronized同步方法一样是同步运行的。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread();
        for (int i = 0; i < 5; i++) threads[i].start();
        // 此版本代码虽然是正确的，但static MyObject getInstance()方法中的全部代码都是同步的了，这样做也会降低运行效率。
    }
}
