package thread._3_communication._1_wait_and_notify._9_notify_too_early;

/**
 * 运行结果：仅仅执行了notify方法
 * 修改main方法：
 * ……
 * a.start();
 * Thread.sleep(1000);
 * b.start();
 * ……
 * 运行结果：正确
 */
class MyRun2 {
    private String lock = new String();
    private boolean isFirstRunB = false;
    private Runnable runnableA = () -> {
        synchronized (lock) {
            while (!isFirstRunB) {
                System.out.println("begin wait");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end wait");
            }
        }
    };

    private Runnable runnableB = () -> {
        synchronized (lock) {
            System.out.println("begin notify");
            lock.notify();
            System.out.println("end notify");
            isFirstRunB = true;
        }
    };

    public static void main(String[] args) {
        MyRun2 run = new MyRun2();
        Thread a = new Thread(run.runnableA);
        Thread b = new Thread(run.runnableB);
        b.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.start();
    }
}
