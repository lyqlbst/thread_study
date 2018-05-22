package thread._3_communication._3_threadLocal._2_verify_isolation._1_demo;

/**
 * 运行效果：类ThreadLocal存储每一个线程的私有数据
 * 虽然3个线程都向t对象中set()数据值，但每个线程还是能取出自己的数据。
 */
class MyMain {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();
        for (int i = 0; i < 10; i++) {
            Tools.t.set("Main" + (i + 1));
            System.out.println("Main get Value=" + Tools.t.get());
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
