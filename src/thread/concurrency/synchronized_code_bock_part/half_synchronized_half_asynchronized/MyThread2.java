package thread.concurrency.synchronized_code_bock_part.half_synchronized_half_asynchronized;

class MyThread2 extends Thread {
    private Task task;

    MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}