package thread._4_lock._1_reentrantLock._8_np_nc_alternate_print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    void set() {
        lock.lock();
        try {
            while (hasValue) {
                System.out.println("有可能★★连续");
                condition.await();
            }
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
            while (!hasValue) {
                System.out.println("有可能☆☆连续");
                condition.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("打印☆");
        hasValue = false;
        condition.signal();
    }
}
