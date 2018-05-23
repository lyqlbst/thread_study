package thread._4_lock._1_reentrantLock._10_count_length_methods._2_getQueueLength;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 方法int getQueueLength()的作用是返回正等待获取此锁定的线程估计数，比如有5个线程，1个线程首先执行了await()方法，
 * 那么在调用getQueueLength()方法后返回值是4，说明有4个线程同时在等待lock的释放。
 */
class Service {
    ReentrantLock lock = new ReentrantLock();

    void serviceMethod1() {
        lock.lock();
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "进入方法");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }
}
