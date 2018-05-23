package thread._4_lock._1_reentrantLock._10_count_length_methods._3_getWaitQueueLength;

/**
 * 方法int getWaitQueueLength(Condition condition)的作用是返回等待与此锁定相关的给定条件Condition的线程估计数，
 * 比如有5个线程，每个线程都执行了同一个condition对象的await()方法，
 * 则调用getWaitQueueLength(Condition condition)方法时返回的int值是5。
 */
class MyMain {

    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = service::waitMethod;
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) threads[i] = new Thread(runnable);
        for (int i = 0; i < 10; i++) threads[i].start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.notifyMethod();
    }
}
