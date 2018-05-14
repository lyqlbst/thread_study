package thread._2_concurrency._2_synchronized_code_blocks_part._15_synchronized_objcet_change._1_demo;

/**
 * 在将任何数据类型作为同步锁时，需要注意的是，是否有多个线程同事持有锁对象，如果同时持有相同的锁对象，
 * 则这些线程之间就是同步的；如果分别获得锁对象，这些线程之间就是异步的。
 * 因为50毫秒后线程B取得的锁是“456”
 */
class MyMain1 {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
    }
}
