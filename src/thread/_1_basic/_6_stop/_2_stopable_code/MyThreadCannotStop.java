package thread._1_basic._6_stop._2_stopable_code;

class MyThreadCannotStop extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
