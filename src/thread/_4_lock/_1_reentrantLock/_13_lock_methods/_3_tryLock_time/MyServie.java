package thread._4_lock._1_reentrantLock._13_lock_methods._3_tryLock_time;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyServie {
    ReentrantLock lock = new ReentrantLock();

    void waitMethod() {
        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + "获得锁的时间：" + System.currentTimeMillis());
                Thread.sleep(1100);
            } else System.out.println(Thread.currentThread().getName() + "没有获得锁");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (lock.isHeldByCurrentThread()) lock.unlock();
        }
    }
}
