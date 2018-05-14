package thread._2_concurrency._2_synchronized_code_blocks_part._9_synchronized_static_and_class._4_synchronized_class;

/**
 * 同步synchronized(class)代码块的作用其实和synchronized static方法的作用一样。
 */
class MyMain {

    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA a = new ThreadA(service1);
        a.setName("A");
        ThreadB b = new ThreadB(service2);
        b.setName("B");
        a.start();
        b.start();
    }
}
