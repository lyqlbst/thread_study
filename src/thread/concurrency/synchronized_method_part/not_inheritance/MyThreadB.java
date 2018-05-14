package thread.concurrency.synchronized_method_part.not_inheritance;

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
