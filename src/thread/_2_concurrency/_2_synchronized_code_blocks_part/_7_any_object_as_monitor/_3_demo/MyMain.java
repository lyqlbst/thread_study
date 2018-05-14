package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo_3;

/**
 * 由于对象监视器不同，所以运行结果就是异步的。由于代码块放在非同步synchronized方法中声明，
 * 并不能保证调用方法的线程的执行同步/顺序性，也就是线程调用方法的顺序是无序的，
 * 虽然在同步块中执行顺序是同步的，这样极易出现“脏读”问题。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("aa");
        ThreadB b = new ThreadB(service);
        b.setName("bb");
        a.start();
        b.start();
    }
}
