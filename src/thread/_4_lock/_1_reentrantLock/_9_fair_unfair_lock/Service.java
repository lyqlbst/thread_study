package thread._4_lock._1_reentrantLock._9_fair_unfair_lock;

import java.util.concurrent.locks.ReentrantLock;

class Service {
    private ReentrantLock lock;

    Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    void serviceMethod() {
        lock.lock();
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "获得锁定");
        lock.unlock();
    }
}
