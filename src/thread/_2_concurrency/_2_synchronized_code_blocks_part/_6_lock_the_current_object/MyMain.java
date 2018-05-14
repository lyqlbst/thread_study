package thread._2_concurrency._2_synchronized_code_blocks_part._6_lock_the_current_object;

class MyMain {

    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
