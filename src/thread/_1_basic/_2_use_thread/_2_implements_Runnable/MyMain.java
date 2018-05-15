package thread._1_basic._2_use_thread._2_implements_Runnable;

class MyMain {

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
