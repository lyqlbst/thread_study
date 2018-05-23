package thread._4_lock._1_reentrantLock._11_has_methods._2_hasWaiters;

/**
 * 方法boolean hasWaiters(Condition condition)的作用是查询是否有线程正在等待与此锁定有关的condition条件。
 */
class MyMain {

    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = service::waitMethod;
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) threads[i] = new Thread(runnable);
        for (int i = 0; i < 10; i++) threads[i].start();
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.notifyMethod();
    }
}
