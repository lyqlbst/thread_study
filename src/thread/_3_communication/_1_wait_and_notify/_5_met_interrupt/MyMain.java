package thread._3_communication._1_wait_and_notify._5_met_interrupt;

/**
 * 当线程呈wait()状态时，调用线程对象的interrupt()方法会出现InterruptedException异常。
 */
class MyMain {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.interrupt();
    }
}
