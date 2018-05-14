package thread._2_concurrency._2_synchronized_code_blocks_part._11_dead_cycle._2_solution;

/**
 * 同步方法容易造成死循环。线程B永远得不到运行的机会，锁死了。
 * 这时就可以使用同步块来解决这样的问题。
 */
class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
