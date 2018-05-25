package thread._7_supplement._7_thread_exception_transmit;

class MyThread extends Thread {
    private String num = "a";

    MyThread() {
        super();
    }

    MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        System.out.println("在线程中打印：" + (numInt + 1));
    }
}
