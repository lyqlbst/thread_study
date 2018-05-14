package thread._1_basic._9_setPriority._1_inheritance;

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
