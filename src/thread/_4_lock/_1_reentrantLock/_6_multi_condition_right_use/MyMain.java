package thread._4_lock._1_reentrantLock._6_multi_condition_right_use;

/**
 * 程序运行结果：线程B没有被唤醒
 * 通过本实验可以得知，使用ReentrantLock对象可以唤醒指定种类的线程，这是控制部分线程行为的方便方式。
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
        service.signalAllA();
    }
}
