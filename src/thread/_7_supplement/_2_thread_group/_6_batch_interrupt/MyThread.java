package thread._7_supplement._2_thread_group._6_batch_interrupt;

class MyThread extends Thread {
    MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "准备开始死循环了：");
        while (true) if (this.isInterrupted()) break;
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "结束了");
    }
}
