package thread._4_lock._1_reentrantLock._13_lock_methods._1_lockInterruptibly;

/**
 * 方法void lockInterruptibly()的作用是：如果当前线程未被中断，则获取锁定，如果已经被中断，则抛出异常。
 * 程序运行结果：没有出现异常，A、B线程正常结束，按钮变灰。
 * 前面实验使用的是Lock()方法，说明线程B被interrupt中断了，那么执行lock()则不会出现异常，正常执行。
 * 如果使用lockInterruptibly方法会是什么结果呢？
 * 将MyService.java中的“lock.lock()”变成“lock.lockInterruptibly();”。
 * 运行结果：线程B被中断后调用lockInterruptibly()方法报异常。
 */
class MyMain {

    public static void main(String[] args) {
        final MyService service = new MyService();
        Runnable runnableRef = service::waitMethod;
        Thread threadA = new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread threadB = new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();    // 打标记
        System.out.println("main end!");
    }
}
