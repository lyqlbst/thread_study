package thread._4_lock._1_reentrantLock._13_lock_methods._2_tryLock;

import java.util.concurrent.locks.ReentrantLock;

class MyService {
    ReentrantLock lock = new ReentrantLock();

    void waitMethod() {
        if (lock.tryLock()) System.out.println(Thread.currentThread().getName() + "获得锁");
        else System.out.println(Thread.currentThread().getName() + "没有获得锁");
        if (lock.isHeldByCurrentThread()) lock.unlock();
    }
}
