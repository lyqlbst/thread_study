package thread.concurrency.synchronized_method_part.exception_auto_release;

/**
 * 线程a出现异常并释放锁，线程b进入方法正常打印，实验的结论就是出现异常的锁被自动释放了
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
