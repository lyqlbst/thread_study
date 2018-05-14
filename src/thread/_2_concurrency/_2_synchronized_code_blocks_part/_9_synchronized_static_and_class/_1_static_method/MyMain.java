package thread._2_concurrency._2_synchronized_code_blocks_part._9_synchronized_static_and_class._1_static_method;

/**
 * 关键字synchronized还可以应用在static静态方法上，如果这样写，那是对当前的*.java文件对应的Class类进行持锁。
 * 从运行结果来看，并没有什么特别之处，都是同步的效果，和将synchronized关键字加到static方法上使用的效果是一样的。
 * 其实还是有本质上的不同的，synchronized关键字加到static静态方法上是给Class类上锁，而synchronized关键字
 * 加到非static静态方法上是给对象上锁。
 */
class MyMain {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("a");
        ThreadB b = new ThreadB();
        b.setName("b");
        a.start();
        b.start();
    }
}
