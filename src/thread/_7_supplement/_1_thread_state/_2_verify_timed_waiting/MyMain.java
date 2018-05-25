package thread._7_supplement._1_thread_state._2_verify_timed_waiting;

/**
 * 线程状态TIMED_WAITING代表线程执行了Thread.sleep()方法，呈等待状态，等待时间到达，继续向下运行。
 * 执行sleep()方法后线程的状态枚举值就是TIMED_WAITING。
 */
class MyMain {

    // NEW,
    // RUNNABLE,
    // TERMINATED,
    // BLOCKED,
    // WAITING,
    // TIMED_WAITING
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main方法中的状态：" + t.getState());
    }
}
