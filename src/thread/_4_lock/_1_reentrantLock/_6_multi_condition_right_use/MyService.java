package thread._4_lock._1_reentrantLock._6_multi_condition_right_use;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA时间为：" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            conditionA.await();
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
            conditionB.await();
            System.out.println("end awaitB时间为：" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void signalAllA() {
        lock.lock();
        System.out.println("signalAll A时间为：" + System.currentTimeMillis()
                + " ThreadName=" + Thread.currentThread().getName());
        conditionA.signalAll();
        lock.unlock();
    }

    void signalAllB() {
        lock.lock();
        System.out.println("signalAll B时间为：" + System.currentTimeMillis()
                + " ThreadName=" + Thread.currentThread().getName());
        conditionB.signalAll();
        lock.unlock();
    }
}
