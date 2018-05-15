package thread._1_basic._2_use_thread._4_variable_thread_safe.shared_data;

/**
 * 共享变量，但是会产生非线程安全问题，在run方法前加synchronized关键字，
 * 使多个线程运行到此方法时，以排队的方式进行处理。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
