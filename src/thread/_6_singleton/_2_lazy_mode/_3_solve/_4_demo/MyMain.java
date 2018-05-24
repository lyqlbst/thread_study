package thread._6_singleton._2_lazy_mode._3_solve._4_demo;

/**
 * 使用DCL双检查锁机制
 * 在最后的步骤中，使用的是DCL双检查锁机制来实现多线程环境中的延迟加载单例设计模式。
 * 程序运行结果：5个线程同一个hashCode，生成了一个对象
 * 使用双重检查锁功能，成功地解决了“懒汉模式”遇到多线程的问题。DCL也是大多数多线程结合单例模式使用的解决方案。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread();
        for (int i = 0; i < 5; i++) threads[i].start();
    }
}
