package thread._4_lock._1_reentrantLock._1_use_reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyService {
    private Lock lock = new ReentrantLock();

    void testMethod() {
        // 调用ReentrantLock对象的lock()方法获取锁，调用unlock()方法释放锁。
        lock.lock();
        for (int i = 0; i < 5; i++)
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " " + (i + 1));
        lock.unlock();
    }
}
