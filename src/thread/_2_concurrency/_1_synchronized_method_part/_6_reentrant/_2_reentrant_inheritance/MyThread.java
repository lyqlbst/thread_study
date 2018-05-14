package thread._2_concurrency._1_synchronized_method_part._6_reentrant._2_reentrant_inheritance;

class MyThread extends Thread{
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
