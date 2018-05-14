package thread._2_concurrency._1_synchronized_method_part._8_not_inheritance;

class MyThreadA extends Thread {
    private Sub sub;

    MyThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
