package thread.concurrency.synchronized_method_part.multiple_objects_syncs;

class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
