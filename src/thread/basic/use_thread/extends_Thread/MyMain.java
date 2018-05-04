package thread.basic.use_thread.extends_Thread;

/**
 * 使用多线程技术时，代码的运行结果与代码执行顺序或是调用顺序无关
 */
class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束");
    }
}
