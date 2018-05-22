package thread._3_communication._2_join._3_exception;

class ThreadC extends Thread {
    private ThreadB threadB;

    ThreadC(ThreadB threadB) {
        super();
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.interrupt();
    }
}
