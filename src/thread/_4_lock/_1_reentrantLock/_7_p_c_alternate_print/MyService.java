package thread._4_lock._1_reentrantLock._7_p_c_alternate_print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    void set() {
        lock.lock();
        try {
            while (hasValue) condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("打印★");
        hasValue = true;
        condition.signal();
        lock.unlock();
    }

    void get() {
        lock.lock();
        try {
            while (!hasValue) condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("打印☆");
        hasValue = false;
        condition.signal();
    }
}
