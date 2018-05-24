package thread._6_singleton._2_lazy_mode._3_solve._3_demo;

/**
 * 针对某些重要的代码进行单独的同步
 * 同步代码块可以针对某些重要的代码进行单独的同步，而其他的代码则不需要同步。这样在运行时，效率完全可以得到大幅提升。
 * 运行结果：5个线程，5种不一样的hashCode，生成了5个对象
 * 此方法使同步synchronized语句块，只对实例化对象的关键代码进行同步，从语句的结构上来讲，运行的效率的确得到了提升。
 * 但如果是遇到多线程的情况下还是无法解决到同一个实例对象的结果。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread();
        for (int i = 0; i < 5; i++) threads[i].start();
        // 此版本代码虽然是正确的，但static MyObject getInstance()方法中的全部代码都是同步的了，这样做也会降低运行效率。
    }
}
