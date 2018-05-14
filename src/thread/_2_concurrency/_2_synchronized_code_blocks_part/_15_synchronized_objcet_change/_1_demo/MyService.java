package thread._2_concurrency._2_synchronized_code_blocks_part._15_synchronized_objcet_change._1_demo;

class MyService {
    private String lock = "123";

    void testMethod() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            lock = "456";
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
        }
    }
}
