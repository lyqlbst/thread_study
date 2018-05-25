package thread._7_supplement._4_simpleDateFormat._3_solve;

/**
 * 前面介绍过，ThreadLocal类能使线程绑定到指定的对象。使用该类也可以解决多线程环境下的SimpleDateFormat类处理错误的情况。
 * 控制台没有信息被输出，结果正确。
 */
class MyMain {

    public static void main(String[] args) {
        String[] dateStrings = new String[9];
        for (int i = 0; i < 9; i++) dateStrings[i] = "2018-05-0" + (i + 1);
        MyThread[] threads = new MyThread[9];
        for (int i = 0; i < 9; i++) threads[i] = new MyThread("yyyy-MM-dd", dateStrings[i]);
        for (MyThread thread : threads) thread.start();
    }
}
