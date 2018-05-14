package thread._1_basic._9_setPriority._1_inheritance;

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
