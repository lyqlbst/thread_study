package thread._2_concurrency._2_synchronized_code_blocks_part.verify_three_conclusions.conclusion_3;

class MyObject {
    void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString ____getLock time=" + System.currentTimeMillis()
                    + " run ThreadName=" + Thread.currentThread().getName());
            System.out.println("----------------");
            System.out.println("speedPrintString ____releaseLock time=" + System.currentTimeMillis()
                    + " run ThreadName=" + Thread.currentThread().getName());
        }
    }
}
