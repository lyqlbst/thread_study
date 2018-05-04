package thread.basic.use_thread.synchrony;

/**
 * 异步运行的效果，extends_Thread()方法通知“线程规划器”此线程已经准备就绪，等待调用线程对象的run()方法。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.setName("myThread1");
        myThread1.start();
        MyThread myThread2 = new MyThread();
        myThread2.setName("myThread2");
        myThread2.start();
    }
}
