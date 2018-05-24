package thread._6_singleton._2_lazy_mode._3_solve._1_demo;

/**
 * 声明synchronized关键字
 * 既然多个线程可以同时进入getInstance()方法，那么只需要对getInstance()方法声明synchronized关键字即可。
 * 运行结果：5个线程得到相同的hashCode
 * 此方法加入同步synchronized关键字可得到相同实例的对象，但此种方法的运行效率非常地下，是同步运行的，
 * 下一个线程想取到对象，则必须等上一个线程释放锁之后，才可以继续执行。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread();
        for (int i = 0; i < 5; i++) threads[i].start();
    }
}
