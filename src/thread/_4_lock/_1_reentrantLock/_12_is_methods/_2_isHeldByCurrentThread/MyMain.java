package thread._4_lock._1_reentrantLock._12_is_methods._2_isHeldByCurrentThread;

/**
 * 方法boolean isHeldByCurrentThread()的作用是查询当前线程是否保持此锁定。
 */
class MyMain {

    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = service::serviceMethod;
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
