package thread.basic.suspend_resume.example3;

/**
 * 还有这种独占所的情况也要格外注意，稍有不慎，就会掉进“坑”里
 * suspend方法执行后，控制台将不打印main end，原因是当程序运行到println()方法内部停止时
 * (println方法前有synchronized关键字)，同步锁未被释放，suspend方法已过时。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.suspend();
        System.out.println("main end!");
    }
}
