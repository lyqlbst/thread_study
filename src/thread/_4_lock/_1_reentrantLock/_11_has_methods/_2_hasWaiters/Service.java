package thread._4_lock._1_reentrantLock._11_has_methods._2_hasWaiters;

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
        System.out.println("有没有线程正在等待newCondition？" + lock.hasWaiters(newCondition)
                + " 线程数是多少？" + lock.getWaitQueueLength(newCondition));
        lock.unlock();
    }
}
