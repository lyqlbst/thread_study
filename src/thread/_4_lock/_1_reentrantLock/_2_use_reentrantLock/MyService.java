package thread._4_lock._1_reentrantLock._2_use_reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyService {
    private Lock lock = new ReentrantLock();

    void methodA() {
        try {
            lock.lock();
            System.out.println("methodA begin ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
            Thread.sleep(50);
            System.out.println("methodA end ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void methodB() {
        try {
            lock.lock();
            System.out.println("methodB begin ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
            Thread.sleep(50);
            System.out.println("methodB end ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
