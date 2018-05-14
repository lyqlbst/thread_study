package thread._2_concurrency._2_synchronized_code_blocks_part.use;

class ObjectService {
    void serviceMethod() {
        synchronized (this) {
            System.out.println("begin time=" + System.currentTimeMillis());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end time=" + System.currentTimeMillis());
        }
    }
}
