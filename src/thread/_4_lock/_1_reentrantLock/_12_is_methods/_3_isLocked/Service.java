package thread._4_lock._1_reentrantLock._12_is_methods._3_isLocked;

import java.util.concurrent.locks.ReentrantLock;

class Service {
    private ReentrantLock lock;

    Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    void serviceMethod() {
        System.out.println(lock.isLocked());
        lock.lock();
        System.out.println(lock.isLocked());
        lock.unlock();
    }
}
