package thread._7_supplement._5_thread_exception._3_demo;

/**
 * 方法setUncaughtExceptionHandler()是给指定线程对象设置的异常处理器。
 * 在Thread类中还可以使用setUncaughtExceptionHandler()方法对所有线程对象设置异常处理器。
 * 方法setUncaughtExceptionHandler()的作用是为指定线程类的所有线程对象设置默认的异常处理器。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println("线程：" + t.getName() + " 出现了异常：");
            e.printStackTrace();
        });
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }
}
