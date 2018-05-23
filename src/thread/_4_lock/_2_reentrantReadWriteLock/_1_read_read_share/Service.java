package thread._4_lock._2_reentrantReadWriteLock._1_read_read_share;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    void read() {
        lock.readLock().lock();
        System.out.println("获得读锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.readLock().unlock();
    }
}
