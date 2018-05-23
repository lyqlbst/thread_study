package thread._4_lock._1_reentrantLock._12_is_methods._1_isFair;

import java.util.concurrent.locks.ReentrantLock;

class Service {
    private ReentrantLock lock;

    Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    void serviceMethod() {
        lock.lock();
        System.out.println("公平锁情况：" + lock.isFair());
        lock.unlock();
    }
}
