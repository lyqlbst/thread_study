package thread._4_lock._1_reentrantLock._3_condition_wrong_use._1_demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    void await() {
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
