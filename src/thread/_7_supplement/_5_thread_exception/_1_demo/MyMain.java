package thread._7_supplement._5_thread_exception._1_demo;

/**
 * 程序运行后在控制台输出空指针异常。在Java的多线程技术中，可以对多线程中的异常进行“捕捉”，
 * 使用的是UncaughtExceptionHandler类，从而可以对发生的异常进行有效的处理。
 */
class MyMain {

    public static void main(String[] args) {
        new MyThread().start();
    }
}
