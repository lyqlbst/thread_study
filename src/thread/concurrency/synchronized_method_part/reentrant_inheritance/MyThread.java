package thread.concurrency.synchronized_method_part.reentrant_inheritance;

class MyThread extends Thread{
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
