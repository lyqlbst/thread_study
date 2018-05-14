package thread._2_concurrency._2_synchronized_code_blocks_part._1_synchronized_method_disadvantages;

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
