package thread._2_concurrency._3_volatile_part._7_synchronize_code_blocks;

/**
 * 关键字synchronized可以使多个线程访问同一个资源具有同步性，
 * 而且它还具有将线程工作内存中的私有变量与公共内存的变量同步的功能。
 * 以-server服务器模式运行此项目，出现死循环。
 * 得到这个结果是各个线程间的数据值没有可视性造成的，而关键字synchronized可以具有可视性。更改service代码：
 * ……
 * void runMethod(){
 *     String anyString = new String();
 *     while(isContinueRun){
 *         synchronized(anyString){
 *         }
 *     }
 *     System.out.println("停下来了！");
 * }
 * ……
 *
 * 再以-server服务器模式运行程序后尅正常退出。
 * 关键字synchronized可以保证在同一时刻，只要一个线程可以执行某一个方法或某一个代码块。它包含两个特征：
 * 互斥性和可见性。同步synchronized不仅可以解决一个线程看到对象处于不一致的状态，
 * 还可以保证进入同步方法或者同步代码块的每个线程，都看到由同一个锁保护之前所有的修改效果。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        a.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
        System.out.println("已经发起停止的命令了！");
    }
}
