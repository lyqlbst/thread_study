package thread._4_lock._1_reentrantLock._5_multi_condition_wrong_use;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA时间为：" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitA时间为：" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB时间为：" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitB时间为：" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void signalAll() {
        lock.lock();
        System.out.println("signalAll时间为：" + System.currentTimeMillis()
                + " ThreadName=" + Thread.currentThread().getName());
        condition.signalAll();
        lock.unlock();
    }
}
