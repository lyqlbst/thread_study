package thread.basic.variable_thread_safe.example2;

class MyThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        //不用for语句，因为使用同步后其他线程就得不到运行的机会了，一直有一个线程进行减法运算
        System.out.println("由 " + Thread.currentThread().getName() + " 计算，count=" + count);
    }
}
