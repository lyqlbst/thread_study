package thread._6_singleton._5_static;

/**
 * 静态代码中的代码在使用类的时候就已经执行了，所以可以应用静态代码块的这个特性来实现单例设计模式。
 * 程序运行结果：所有线程的hashCode都是相同的，单例
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread();
        for (int i = 0; i < 5; i++) threads[i].start();
    }
}
