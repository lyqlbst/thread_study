package thread._2_concurrency._2_synchronized_code_blocks_part._15_synchronized_objcet_change._1_demo;

/**
 * 去掉代码Thread.sleep(50)
 * 线程A和B持有的锁都是“123”，虽然将锁改成了“456”，但结果还是同步的，因为A和B统统争抢的锁是“123”。
 * 还要提示一下，只要对象不变，即使对象的属性被改变，运行的结果还是同步的。
 */
class MyMain2 {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
