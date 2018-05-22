package thread._3_communication._3_threadLocal._2_verify_isolation._2_demo;

/**
 * 运行结果：运行结果只有两种时间
 * 在第一次调用ThreadLocal类的get()方法返回的是null，怎么样实现第一次调用get()不反悔null呢？也就是具有默认值效果。
 */
class MyMain {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
    }
}
