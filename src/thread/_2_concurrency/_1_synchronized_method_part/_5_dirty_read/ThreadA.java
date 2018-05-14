package thread._2_concurrency._1_synchronized_method_part._5_dirty_read;

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
