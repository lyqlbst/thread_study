package thread._7_supplement._5_thread_exception._2_demo;

/**
 * 方法setUncaughtExceptionHandler()的作用是对指定的线程对象设置默认的异常处理器。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("线程：" + t.getName() + " 出现了异常：");
            e.printStackTrace();
        });
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("线程2");
        t2.start();
    }
}
