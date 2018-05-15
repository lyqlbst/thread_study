package thread._2_concurrency._3_volatile_part._3_solve_async_dead_cycle;

/**
 * 配置JVM的运行参数为-server。
 *
 * 代码“System.out.println("线程被停止了！")”从未被执行。
 *
 * 是什么样的原因造成将JVM设置为-server时就出现死循环呢？
 * 在启动RunThread.java线程时，变量private boolEAN isRunning = true;存在于公共堆栈及线程的私有堆栈中。
 * 在JVM被设置为-server模式时为了线程运行的效率，线程一直在私有堆栈中取得isRunning的值是true。
 * 而代码thread.setRunning(false);虽然被执行，更新的却是公共堆栈中的isRunning变量值false，
 * 所以一直就是死循环的状态。
 *
 * 这个问题其实就是私有堆栈中的值和公共堆栈中的值不同步造成的。解决这样的问题就要使用volatile关键字了，
 * 它主要的作用就是当线程访问isRunning这个变量时，强制性从公共堆栈中进行取值：
 * private volatile isRunning = false;
 */
class MyMain {

    public static void main(String[] args) {
        RunThread thread = new RunThread();
        thread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.setRunning(false);
        System.out.println("已经赋值为false");
    }
}
