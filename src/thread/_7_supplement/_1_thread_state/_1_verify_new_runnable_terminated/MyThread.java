package thread._7_supplement._1_thread_state._1_verify_new_runnable_terminated;

class MyThread extends Thread {
    MyThread() {
        System.out.println("构造方法中的状态：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态：" + Thread.currentThread().getState());
    }
}
