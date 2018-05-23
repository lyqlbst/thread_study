package thread._4_lock._1_reentrantLock._9_fair_unfair_lock;

class MyMain {

    public static void main(String[] args) {
        runFair();
//        runUnFair();
    }

    /**
     * 打印的结果基本是呈有序的状态，这就是公平锁的特点。
     */
    private static void runFair() {
        final Service service = new Service(true);
        Runnable runnable = () -> {
            System.out.println("★线程" + Thread.currentThread().getName() + "运行了");
            service.serviceMethod();
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) threads[i] = new Thread(runnable);
        for (int i = 0; i < 10; i++) threads[i].start();
    }

    /**
     * 非公平锁的运行结果基本上是乱序的，说明start()启动的线程不代表先获得锁。
     */
    private static void runUnFair() {
        final Service service = new Service(false);
        Runnable runnable = () -> {
            System.out.println("★线程" + Thread.currentThread().getName() + "运行了");
            service.serviceMethod();
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) threads[i] = new Thread(runnable);
        for (int i = 0; i < 10; i++) threads[i].start();
    }
}
