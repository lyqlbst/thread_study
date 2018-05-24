package thread._6_singleton._2_lazy_mode._2_shortcoming;

/**
 * 前面两个实验虽然使用“立即加载”和“延迟加载”实现了单例设计模式，但在多线程的环境中，
 * 前面“延迟加载”示例中的代码完全就是错误的，根本不能实现保持单例的状态。
 * 来看一下如何在多线程环境中结合“错误的单例模式”创建出“多例”。
 * 控制台打印出了5种hashCode，说明创建出了5个对象，并不是单例的，这就是“错误的单例模式”。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread();
        for (int i = 0; i < 5; i++) threads[i].start();
    }
}
