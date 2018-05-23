package thread._4_lock._1_reentrantLock._14_awaitUninterruptibly;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    void testMethod() {
        lock.lock();
        System.out.println("wait begin");
        try {
            condition.awaitUninterruptibly();
        } catch (IllegalMonitorStateException e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }
        System.out.println("wait end");
    }
}
