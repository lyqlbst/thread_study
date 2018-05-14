package thread._2_concurrency._2_synchronized_code_blocks_part.synchronized_method_disadvantages;

/**
 * 使用synchronized关键字来声明方法 synchronized void doLongTimeTask() 时从运行时间上来看，弊端很明显，
 * 解决这样的问题，可以使用synchronized同步块
 */
class MyMain {

    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 < CommonUtils.beginTime1)
            beginTime = CommonUtils.beginTime2;
        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > CommonUtils.endTime1)
            endTime = CommonUtils.endTime2;
        System.out.println("耗时：" + ((endTime - beginTime) / 1000));
    }
}
