package thread._3_communication._1_wait_and_notify._3_implementation._4_demo;

/**
 * 日志信息wait end在最后输出，这也说明notify()方法执行后并不立即释放锁。
 */
class MyMain {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        ThreadB b = new ThreadB(lock);
        a.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
    }
}
