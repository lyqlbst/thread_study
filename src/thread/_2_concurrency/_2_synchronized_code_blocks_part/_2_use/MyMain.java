package thread._2_concurrency._2_synchronized_code_blocks_part._2_use;

/**
 * 当两个并发线程访问同一个对象object中的synchronized(this)同步代码块时，一段时间内只能有一个线程被执行，
 * 另一个线程必须等待当前线程执行完这个代码块以后才能执行该代码块。
 * 本实验虽然使用了synchronized同步代码块，但是执行效率还是没有提高，执行的效果还是同步运行的。
 */
class MyMain {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
