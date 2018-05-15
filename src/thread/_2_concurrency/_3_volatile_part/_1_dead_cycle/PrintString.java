package thread._2_concurrency._3_volatile_part._1_dead_cycle;

class PrintString {
    private boolean isContinuePrint = true;

    void printStringMethod() {
        while (isContinuePrint) {
            System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
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
