package thread.basic.use_thread.extends_Thread;

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
