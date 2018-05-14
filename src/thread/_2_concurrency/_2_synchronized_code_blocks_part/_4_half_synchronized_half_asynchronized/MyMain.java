package thread._2_concurrency._2_synchronized_code_blocks_part.half_synchronized_half_asynchronized;

/**
 * 不在synchronized块中就是一步执行，在synchronized块中就是同步执行。
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
