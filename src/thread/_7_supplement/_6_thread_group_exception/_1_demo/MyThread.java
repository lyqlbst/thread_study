package thread._7_supplement._6_thread_group_exception._1_demo;

class MyThread extends Thread {
    private String num;

    MyThread(ThreadGroup group, String name, String num) {
        super(group, name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        while (true) System.out.println("死循环中：" + Thread.currentThread().getName());
    }
}
