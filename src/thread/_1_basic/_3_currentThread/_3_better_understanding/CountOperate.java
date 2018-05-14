package thread._1_basic._3_currentThread._3_better_understanding;

class CountOperate extends Thread {
    CountOperate() {
        System.out.println("CountOperate--begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("CountOperate--end");
    }

    @Override
    public void run() {
        System.out.println("run--begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("run--end");
    }
}
