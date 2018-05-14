package thread._1_basic._10_daemon;

/**
 * 在Java线程中有两种线程，一种是用户线程，另一种就是守护线程（Daemon）线程。
 * 守护线程是一种特殊的线程，它的特性有陪伴的含义，当进程中不存在非守护进程了，则守护线程自动销毁。
 * 典型的守护线程就是垃圾回收线程，当进程中没有非守护线程了，则垃圾回收线程就没有存在的必要了，
 * 自动销毁，并随JVM一同结束工作。
 * 守护线程的作用是为了其他线程的运行提供便利服务，最典型的应用就是GC（垃圾回收器），它就是一个守护进程
 */
class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我离开thread对象也不再打印了，也就是停止了！");
    }
}
