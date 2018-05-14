package thread._2_concurrency._2_synchronized_code_blocks_part._10_string_constant_pool._1_trouble;

/**
 * 将synchronized(String)同步块与String联合起来使用时，要注意常量池带来的一些例外。
 * 出现这样的情况就是因为String的两个值都是AA，两个线程持有相同的锁，所以线程B不能执行。
 * 这就是String常量池锁带来的问题。因此在大多数情况下，同步synchronized代码块都不适用String作为所对象，
 * 而改用其他，比如 new Object()实例化一个Object对象，但它并不放入缓存中。
 */
public class MyMain {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
