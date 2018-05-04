package thread.basic.variable_thread_safe.non_shared_data;

class MyThread extends Thread {
    private int count = 5;

    MyThread(String name) {
        super();
        this.setName(name); //设置线程名称
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + Thread.currentThread().getName() + " 计算，count=" + count);
        }
    }
}
