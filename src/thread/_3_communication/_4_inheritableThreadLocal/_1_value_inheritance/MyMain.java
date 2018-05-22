package thread._3_communication._4_inheritableThreadLocal._1_value_inheritance;

/**
 * 使用InheritableThreadLocal类可以让子线程从父线程中取得值。
 */
class MyMain {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Main线程中取值=" + Tools.t.get());
            try {
                Thread.sleep(10);
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
