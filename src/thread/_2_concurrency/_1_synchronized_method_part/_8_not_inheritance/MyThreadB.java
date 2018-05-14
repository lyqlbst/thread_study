package thread._2_concurrency._1_synchronized_method_part._8_not_inheritance;

class MyThreadB extends Thread {
    private Sub sub;

    MyThreadB(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
