package thread._3_communication._2_join._3_exception;

/**
 * 在join过程中，如果当前线程对象被中断了，则当前线程出现异常。
 * 程序运行结果：出现异常
 * 说明join()与interrupt()方法如果彼此遇到，则会出现异常。但进程按钮还呈“红色”，原因是线程ThreadA还在继续运行，
 * 线程ThreadA并未出现异常，是正常执行的状态。
 */
class MyMain {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC(b);
        b.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.start();
    }
}
