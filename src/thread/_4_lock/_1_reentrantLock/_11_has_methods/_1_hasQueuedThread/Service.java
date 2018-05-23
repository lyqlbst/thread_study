package thread._4_lock._1_reentrantLock._11_has_methods._1_hasQueuedThread;

import java.util.concurrent.locks.ReentrantLock;

class Service {
    ReentrantLock lock = new ReentrantLock();

    void waitMethod() {
        lock.lock();
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }
}
