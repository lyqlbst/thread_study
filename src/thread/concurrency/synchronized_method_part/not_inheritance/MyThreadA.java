package thread.concurrency.synchronized_method_part.not_inheritance;

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
