package thread._2_concurrency._2_synchronized_code_blocks_part._8_verify_three_conclusions._1_conclusion;

class Service {
    void testMethod1(MyObject object) {
        synchronized (object) {
            System.out.println("testMethod1____getLock time=" + System.currentTimeMillis()
                    + " run ThreadName=" + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("testMethod1____releaseLock time=" + System.currentTimeMillis()
                    + " run ThreadName=" + Thread.currentThread().getName());
        }
    }
}
