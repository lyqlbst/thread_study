package thread._2_concurrency._2_synchronized_code_blocks_part._8_verify_three_conclusions._3_conclusion;

class Service {
    void testMethod1(MyObject object) {
        synchronized (object) {
            System.out.println("testMethod1 ___getLock time=" + System.currentTimeMillis()
                    + " run ThreadName=" + ThreadB.currentThread().getName());
            try {
                ThreadB.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("testMethod1 ___releaseLock time=" + System.currentTimeMillis()
                    + " run ThreadName=" + ThreadB.currentThread().getName());
        }
    }
}
