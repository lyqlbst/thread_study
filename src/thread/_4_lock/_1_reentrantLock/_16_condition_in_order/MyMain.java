package thread._4_lock._1_reentrantLock._16_condition_in_order;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Condition对象可以对线程执行的业务进行排序规划。
 * 程序运行结果：按顺序打印
 */
class MyMain {
    private volatile static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    private final static Condition conditionA = lock.newCondition();
    private final static Condition conditionB = lock.newCondition();
    private final static Condition conditionC = lock.newCondition();

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            lock.lock();
            try {
                while (nextPrintWho != 1) conditionA.await();
                for (int i = 0; i < 3; i++) System.out.println("ThreadA " + (i + 1));
                nextPrintWho = 2;
                conditionB.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        Thread threadB = new Thread(() -> {
            lock.lock();
            try {
                while (nextPrintWho != 2) conditionB.await();
                for (int i = 0; i < 3; i++) System.out.println("ThreadB " + (i + 1));
                nextPrintWho = 3;
                conditionC.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        Thread threadC = new Thread(() -> {
            lock.lock();
            try {
                while (nextPrintWho != 3) conditionC.await();
                for (int i = 0; i < 3; i++) System.out.println("ThreadC " + (i + 1));
                nextPrintWho = 1;
                conditionA.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        Thread[] aThreads = new Thread[5];
        Thread[] bThreads = new Thread[5];
        Thread[] cThreads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            aThreads[i] = new Thread(threadA);
            bThreads[i] = new Thread(threadB);
            cThreads[i] = new Thread(threadC);
            aThreads[i].start();
            bThreads[i].start();
            cThreads[i].start();
        }
    }
}
