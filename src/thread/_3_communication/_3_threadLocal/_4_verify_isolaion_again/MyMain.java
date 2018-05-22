package thread._3_communication._3_threadLocal._4_verify_isolaion_again;

/**
 * 运行结果：各有各的值
 * 子线程和父线程各有各自所拥有的值。
 */
class MyMain {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        for (int i = 0; i < 10; i++) {
            System.out.println("在Main线程中取值=" + Tools.t.get());
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
        a.start();
    }
}
