package thread._7_supplement._7_thread_exception_transmit;

/**
 * 前面介绍了若干个线程异常处理的方式，那么这些处理的方式如果放在一起运行，会出现什么样的结果呢？
 */
class MyMain {

    public static void main(String[] args) {
        run1();
    }

    /**
     * 程序运行结果：对象异常处理被运行
     */
    static void run1(){
        MyThread myThread = new MyThread();
        // 对象
        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        // 类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }

    /**
     * 程序运行结果：静态异常处理被运行
     */
    static void run2(){
        MyThread myThread = new MyThread();
        // 类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }

    /**
     * 程序运行结果：对象异常处理被运行
     */
    static void run3(){
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(group, "我的线程");
        // 对象
        myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        // 类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }

    /**
     * 程序运行结果：静态异常处理和线程组异常处理被运行
     * 本示例要想打印“静态的异常处理”的信息，
     * 则必须在 public void uncaughtException(Thread t, Throwable e) 方法中加上 super.uncaughtException(t, e); 代码。
     */
    static void run4(){
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(group, "我的线程");
        // 类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }

    /**
     * 程序运行结果：线程组异常处理被运行
     */
    static void run5(){
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(group, "我的线程");
        myThread.start();
    }
}
