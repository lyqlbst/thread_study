package thread._6_singleton._1_hungry_mode;

/**
 * 什么是立即加载？立即加载就是使用类的时候已经将对象创建完毕，常见的实现办法就是直接new实例化。
 * 而立即加载从中文的语境来看，有“着急”、“急迫”的含义，所以也成为“饿汉模式”。
 * 立即加载/“饿汉模式”是在调用方法前，实例已经被创建了。
 * 控制台打印的hashCode是同一个值，说明对象是同一个，也就实现了立即加载型单例设计模式。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) threads[i] = new MyThread();
        for (int i = 0; i < 5; i++) threads[i].start();
    }
}
