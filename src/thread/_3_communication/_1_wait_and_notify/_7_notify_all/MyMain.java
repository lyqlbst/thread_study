package thread._3_communication._1_wait_and_notify._7_notify_all;

/**
 * 前面示例中通过多次调用notify()方法来实现唤醒3个线程，但并不能保证系统中仅有3个线程，
 * 也就是若notify()方法的调用次数小于线程对象的数量，会出现部分线程对象无法被唤醒的情况。为了唤醒全部线程，
 * 可以使用notifyAll()方法。
 * 运行结果：唤醒全部线程
 */
class MyMain {

    public static void main(String[] args) {
        Service lock = new Service();
        ThreadA a = new ThreadA(lock);
        ThreadB b = new ThreadB(lock);
        ThreadC c = new ThreadC(lock);
        NotifyThread notifyThread = new NotifyThread(lock);
        a.start();
        b.start();
        c.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyThread.start();
    }
}
