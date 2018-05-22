package thread._3_communication._4_inheritableThreadLocal._2_update_value;

/**
 * 如果在继承的同时还可以对值进行进一步的处理那就更好了。
 * 运行结果：成功继承并修改
 * 但在使用InheritableThreadLocal类需要注意的一点是，如果子线程在取得值的同时，
 * 主线程将InheritableThreadLocal中的值进行更改，那么子线程取到的值还是旧值。
 */
class MyMain {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Main线程中取值=" + Tools.t.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadA a = new ThreadA();
        a.start();
    }
}
