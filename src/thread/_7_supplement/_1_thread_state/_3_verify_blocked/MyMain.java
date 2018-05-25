package thread._7_supplement._1_thread_state._3_verify_blocked;

/**
 * BLOCKED状态出现在某一个线程在等待锁的时候。
 * 从控制台打印的结果来看，t2线程一直在等待t1释放锁，所以t2当时的状态就是BLOCKED。
 */
class MyMain {

    // NEW,
    // RUNNABLE,
    // TERMINATED,
    // BLOCKED,
    // WAITING,
    // TIMED_WAITING
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("a");
        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        t1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main方法中的t2状态：" + t2.getState());
    }
}
