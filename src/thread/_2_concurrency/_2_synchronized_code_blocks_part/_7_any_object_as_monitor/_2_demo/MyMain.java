package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo2;

/**
 * 可见，使用“synchronized(非this对象x)同步代码块”格式进行同步操作时，对象监视器必须是同一个对象，
 * 如果不是同一个对象监视器，运行的结果就是异步调用了，就会交叉运行。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        ThreadB b = new ThreadB(service);
        b.setName("b");
        a.start();
        b.start();
    }
}
