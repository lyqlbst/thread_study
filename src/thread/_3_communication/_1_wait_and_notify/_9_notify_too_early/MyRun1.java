package thread._3_communication._1_wait_and_notify._9_notify_too_early;

/**
 * 如果通知过早，则会打断程序正常的运行逻辑。
 * 运行结果：正常
 * 若修改main方法：
 * ……
 * b.start();
 * Thread.sleep(1000);
 * a.start();
 * ……
 * 运行结果：方法wait永远不会被通知
 * 如果先通知了，wait方法也就没有执行的必要了。
 */
class MyRun1 {
    private String lock = new String();
    private Runnable runnableA = () -> {
        synchronized (lock) {
            System.out.println("begin wait");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end wait");
        }
    };

    private Runnable runnableB = () -> {
        synchronized (lock) {
            System.out.println("begin notify");
            lock.notify();
            System.out.println("end notify");
        }
    };

    public static void main(String[] args) {
        MyRun1 run = new MyRun1();
        Thread a = new Thread(run.runnableA);
        Thread b = new Thread(run.runnableB);
        a.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
    }
}
