package thread._2_concurrency._3_volatile_part._4_none_atomic;

/**
 * 运行结果值不是100000
 *关键字volatile虽然增加了实例变量在多个线程之间的可见性，但它不具备同步性，那么也就是不具备原子性。
 * 将MyThread中的addCount代码改为：
 *
 * //注意一定要添加static关键字
 * //这样synchronized与static锁的内容就是MyThread.class类了
 * //也就达到同步的效果了
 * private synchronized static void addCount(){
 *     ……
 * }
 *
 * 运行结果是100000
 * 如果方法private static void addCount()前加入synchronized同步关键字，
 * 也就没有必要再使用volatile关键字来声明count变量了
 */
class MyMain {

    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; i++) myThreads[i] = new MyThread();
        for (int i = 0; i < 100; i++) myThreads[i].start();
    }
}
