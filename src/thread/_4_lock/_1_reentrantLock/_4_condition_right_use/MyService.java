package thread._4_lock._1_reentrantLock._4_condition_right_use;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    void await() {
        try {
            lock.lock();
            System.out.println("await时间为：" + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void signal() {
        lock.lock();
        System.out.println("signal时间为：" + System.currentTimeMillis());
        condition.signal();
        lock.unlock();
    }
}
