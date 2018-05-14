package thread.concurrency.synchronized_code_bock_part.half_synchronized_half_asynchronized;

/**\
 * 在使用同步synchronized(this)代码块时需要注意的是，当一个线程访问object的一个synchronized(this)同步代码块时，
 * 其他线程对同一个object中所有其他synchronized(this)同步代码块的访问将被阻塞，这说明synchronized使用的
 * “对象监视器”是一个。
 */
class MyMain {

    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        MyThread2 thread2 = new MyThread2(task);
        thread1.start();
        thread2.start();
    }
}
