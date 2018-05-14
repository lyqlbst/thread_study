package thread._1_basic._8_yield;

/**
 * yield()方法的作用是放弃当前的CPU资源，让它给其他的任务去占用CPU执行时间。
 * 但放弃时间不确定，有可能刚刚放弃，马上又获得CPU的时间片
 */
class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
