package thread._4_lock._1_reentrantLock._10_count_length_methods._3_getWaitQueueLength;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = lock.newCondition();

    void waitMethod() {
        lock.lock();
        try {
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }

    void notifyMethod() {
        lock.lock();
        System.out.println("有" + lock.getWaitQueueLength(newCondition) + "个线程正在等待newCondition");
        newCondition.signalAll();
        lock.unlock();
    }
}
