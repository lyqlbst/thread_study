package thread.concurrency.synchronized_code_bock_part.synchronized_method_disadvantages;

class MyThread2 extends Thread {
    private Task task;

    MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
