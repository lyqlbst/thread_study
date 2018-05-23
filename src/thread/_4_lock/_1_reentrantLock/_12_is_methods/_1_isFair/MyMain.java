package thread._4_lock._1_reentrantLock._12_is_methods._1_isFair;

/**
 * 方法boolean isFair()的作用是判断是不是公平锁。
 * 在默认情况下，ReentrantLock类使用的是非公平锁。
 */
class MyMain {

    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = service1::serviceMethod;
        Thread thread = new Thread(runnable);
        thread.start();
        Service service2 = new Service(false);
        runnable = service2::serviceMethod;
        thread = new Thread(runnable);
        thread.start();
    }
}
