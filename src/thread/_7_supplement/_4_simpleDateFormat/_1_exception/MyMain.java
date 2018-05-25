package thread._7_supplement._4_simpleDateFormat._1_exception;

import java.text.SimpleDateFormat;

/**
 * 本示例将实现类SimpleDateFormat在多线程环境下处理日期但得出的结果确实错误的情况，
 * 这也是在多线程环境开发中容易遇到的问题。
 * 从控制台中打印的结果来看，使用单例的SimpleDateFormat类在多线程的环境中处理日期，极易出现日期转换错误的情况。
 */
class MyMain {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStrings = new String[10];
        for (int i = 0; i < 9; i++) dateStrings[i] = "2018-05-0" + (i + 1);
        dateStrings[9] = "2018-05-10";
        MyThread[] threads = new MyThread[10];
        for (int i = 0; i < 10; i++) threads[i] = new MyThread(sdf, dateStrings[i]);
        for (MyThread thread : threads) thread.start();
    }
}
