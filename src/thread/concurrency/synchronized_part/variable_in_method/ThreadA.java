package thread.concurrency.synchronized_part.variable_in_method;

class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;

    ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
