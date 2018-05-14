package thread._2_concurrency._2_synchronized_code_blocks_part.synchronization_between_code_blocks;

/**
 * 在使用同步synchronized(this)代码块时需要注意的是，当一个线程访问object的一个synchronized(this)同步代码块时，
 * 其他线程对同一个object中所有其他synchronized(this)同步代码块的访问将被阻塞，这说明synchronized使用的
 * “对象监视器”是一个。
 */
class MyMain {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        TheadA a = new TheadA(service);
        a.setName("a");
        TheadB b = new TheadB(service);
        b.setName("b");
        a.start();
        b.start();
    }
}
