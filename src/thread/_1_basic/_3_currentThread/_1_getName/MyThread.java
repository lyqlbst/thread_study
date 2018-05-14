package thread._1_basic._3_currentThread._1_getName;

class MyThread extends Thread {

    MyThread() {
        System.out.println("MyThread1--begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("MyThread1--end");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run--begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("run--end");
    }
}
