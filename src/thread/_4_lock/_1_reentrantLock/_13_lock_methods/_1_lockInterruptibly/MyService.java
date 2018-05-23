package thread._4_lock._1_reentrantLock._13_lock_methods._1_lockInterruptibly;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class MyService {
    ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    void waitMethod() {
        lock.lock();
        System.out.println("lock begin " + Thread.currentThread().getName());
        for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
            String newString = new String();
            Math.random();
        }
        System.out.println("lock end " + Thread.currentThread().getName());
        if (lock.isHeldByCurrentThread()) lock.unlock();
    }
}
