package thread._4_lock._1_reentrantLock._13_lock_methods._3_tryLock_time;

/**
 * 方法boolean tryLock(long timeout, TimeUnit unit)的作用是，如果锁定在给定等待时间内没有被另一个线程保持，
 * 且当前线程未被中断，则获取该锁定。
 */
class MyMain {

    public static void main(String[] args) {
        final MyServie service = new MyServie();
        Runnable runnableRef = () -> {
            System.out.println(Thread.currentThread().getName() + "调用waitSecond时间：" + System.currentTimeMillis());
            service.waitMethod();
        };
        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
