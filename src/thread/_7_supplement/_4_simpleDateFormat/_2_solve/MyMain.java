package thread._7_supplement._4_simpleDateFormat._2_solve;

/**
 * 控制台中没有输出任何异常，解决处理错误的原理其实就是创建了多个SimpleDateFormat类的实例。
 */
class MyMain {

    public static void main(String[] args) {
        String[] dateStrings = new String[10];
        for (int i = 0; i < 9; i++) dateStrings[i] = "2018-05-0" + (i + 1);
        dateStrings[9] = "2018-05-10";
        MyThread[] threads = new MyThread[10];
        for (int i = 0; i < 10; i++) threads[i] = new MyThread("yyyy-MM-dd", dateStrings[i]);
        for (MyThread thread : threads) thread.start();
    }
}
