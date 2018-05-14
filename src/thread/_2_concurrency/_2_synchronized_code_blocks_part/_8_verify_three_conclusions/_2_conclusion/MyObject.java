package thread._2_concurrency._2_synchronized_code_blocks_part.verify_three_conclusions.conclusion_2;

class MyObject {
    synchronized void speedPrintString() {
        System.out.println("speedPrintString ____getLock time=" + System.currentTimeMillis()
                + " run ThreadName=" + Thread.currentThread().getName());
        System.out.println("----------------");
        System.out.println("speedPrintString ____releaseLock time=" + System.currentTimeMillis()
                + " run ThreadName=" + Thread.currentThread().getName());
    }
}
