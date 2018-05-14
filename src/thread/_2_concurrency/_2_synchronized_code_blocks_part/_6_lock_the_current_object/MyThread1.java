package thread._2_concurrency._2_synchronized_code_blocks_part.lock_the_current_object;

class MyThread1 extends Thread {
    private Task task;

    MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
