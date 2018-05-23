package thread._4_lock._1_reentrantLock._11_has_methods._1_hasQueuedThread;

/**
 * 方法boolean hasQueuedThread(Thread thread)的作用是查询指定的线程是否在等待获取此锁定。
 * 方法boolean hasQueuedThreads()的所用是查询是否有线程正在等待获取此锁定。
 */
class MyMain {

    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = service::waitMethod;
        Thread threadA = new Thread(runnable);
        Thread threadB = new Thread(runnable);
        threadA.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
