package thread._3_communication._2_join._7_accident_explain;

/**
 * 多次运行MyMain.java文件后，可以发现一个规律：main end往往都是第一个打印的。所以可以完全确定地得出一个结论：
 * 方法join(500)大部分是先运行的，也就是先抢到ThreadB的锁，然后快速进行释放。
 */
class MyMain {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println("main end=" + System.currentTimeMillis());
    }
}
