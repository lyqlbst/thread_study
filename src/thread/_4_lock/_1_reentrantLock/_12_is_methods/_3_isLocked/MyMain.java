package thread._4_lock._1_reentrantLock._12_is_methods._3_isLocked;

/**
 * 方法boolean isLocked()的作用是查询此锁定是否由任意线程保持。
 */
class MyMain {

    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = service::serviceMethod;
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
