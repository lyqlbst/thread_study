package thread.concurrency.synchronized_method_part.dirty_read;

class ThreadA extends Thread {
    private PublicVar publicVar;

    ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}
