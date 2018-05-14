package thread._2_concurrency._1_synchronized_method_part._4_method_and_object;

/**
 * 虽然线程A先持有了object对象的锁，但线程B完全可以异步调用非synchronized类型的方法。
 */
class MyMain {

    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
