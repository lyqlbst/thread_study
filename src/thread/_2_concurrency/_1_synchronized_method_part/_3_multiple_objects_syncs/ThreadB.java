package thread._2_concurrency._1_synchronized_method_part._3_multiple_objects_syncs;

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
