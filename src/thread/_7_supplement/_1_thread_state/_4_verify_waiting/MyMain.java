package thread._7_supplement._1_thread_state._4_verify_waiting;

/**
 * 状态WAITING是线程执行了Object.wait()方法后所处的状态。
 * 执行wait()方法后线程的状态枚举值就是WAITING。
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
        System.out.println("main方法中的t状态：" + t.getState());
    }
}
