package thread._2_concurrency._2_synchronized_code_blocks_part._3_solve_synchronized_method_disadvantages;

/**
 * 通过实验可以得知，当一个线程访问object的一个synchronized同步代码块时，另一个线程仍然可以访问该
 * object对象中的非synchronized(this)同步代码块。
 * 实验中，虽然时间缩短，运行效率加快，但同步synchronized代码块真的是同步的吗？真的持有当前调用对象的锁吗？
 * 答案为是，但必须用代码的方式来进行验证。
 */
class MyMain {

    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        MyThread2 thread2 = new MyThread2(task);
        thread1.start();
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
