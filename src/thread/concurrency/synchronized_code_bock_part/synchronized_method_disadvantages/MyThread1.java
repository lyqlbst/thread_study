package thread.concurrency.synchronized_code_bock_part.synchronized_method_disadvantages;

class MyThread1 extends Thread {
    private Task task;

    MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
