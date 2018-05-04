package thread_name;

public class MyThread extends Thread {

    public MyThread() {
        System.out.println("MyThread--begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("MyThread--end");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run--begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("run--end");
    }
}
