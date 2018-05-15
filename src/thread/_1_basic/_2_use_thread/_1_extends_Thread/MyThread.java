package thread._1_basic._2_use_thread._1_extends_Thread;

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread1");
    }
}
