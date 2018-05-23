package thread._4_lock._1_reentrantLock._10_count_length_methods._1_getHoldCount;

import java.util.concurrent.locks.ReentrantLock;

class Service {
    private ReentrantLock lock = new ReentrantLock();

    void serviceMethod1() {
        lock.lock();
        System.out.println("serviceMethod1 geHoldCount=" + lock.getHoldCount());
        serviceMethod2();
        lock.unlock();
    }

    void serviceMethod2() {
        lock.lock();
        System.out.println("serviceMethod2 getHoldCount=" + lock.getHoldCount());
        lock.unlock();
    }
}
