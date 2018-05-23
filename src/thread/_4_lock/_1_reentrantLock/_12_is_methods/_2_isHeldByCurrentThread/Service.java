package thread._4_lock._1_reentrantLock._12_is_methods._2_isHeldByCurrentThread;

import java.util.concurrent.locks.ReentrantLock;

class Service {
    private ReentrantLock lock;

    Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    void serviceMethod() {
        System.out.println(lock.isHeldByCurrentThread());
        lock.lock();
        System.out.println(lock.isHeldByCurrentThread());
        lock.unlock();
    }
}
