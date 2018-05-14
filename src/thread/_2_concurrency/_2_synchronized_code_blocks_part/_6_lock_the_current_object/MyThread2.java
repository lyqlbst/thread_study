package thread._2_concurrency._2_synchronized_code_blocks_part._6_lock_the_current_object;

class MyThread2 extends Thread {
    private Task task;

    MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
