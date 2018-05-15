package thread._2_concurrency._3_volatile_part._2_solve_sync_dead_cycle;

class PrintString implements Runnable {
    private boolean isContinuePrint = true;

    @Override
    public void run() {
        while (isContinuePrint) {
            System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    boolean isContinuePrint() {
        return isContinuePrint;
    }

    void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }
}
