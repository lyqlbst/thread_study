package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo_4;

/**
 * 多个线程调用同一个方法是随机的。
 * 从运行结果来看，同步块中的代码是同步打印的，当前线程的“执行”与“退出”是承兑出现的。
 * 但线程A和线程B的执行却是异步的，只就有可能出现脏读的环境。由于线程执行方法的顺序不确定，
 * 所以当A和B两个线程执行带有分之判断的方法时，就会出现逻辑上的错误，有可能出现脏读。
 */
class MyThreadA extends Thread {
    private MyList list;

    MyThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) list.add("threadA" + (i + 1));
    }
}
