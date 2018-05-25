package thread._7_supplement._3_thread_orderly;

/**
 * 正常的情况下，线程在运行时多个线程之间执行任务的时机是无需的。可以通过改造代码的方式使它们运行具有有序性。
 */
class MyMain {

    public static void main(String[] args) {
        Object lock = new Object();
        MyThread a = new MyThread(lock, "A", 1);
        MyThread b = new MyThread(lock, "B", 2);
        MyThread c = new MyThread(lock, "C", 0);
        a.start();
        b.start();
        c.start();
    }
}
