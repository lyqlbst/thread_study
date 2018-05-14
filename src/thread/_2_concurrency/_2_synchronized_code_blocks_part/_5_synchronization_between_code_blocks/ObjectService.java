package thread._2_concurrency._2_synchronized_code_blocks_part.synchronization_between_code_blocks;

class ObjectService {
    void serviceMethodA() {
        synchronized (this) {
            System.out.println("A begin time=" + System.currentTimeMillis());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A end time=" + System.currentTimeMillis());
        }
    }

    void serviceMethodB() {
        synchronized (this) {
            System.out.println("B begin time=" + System.currentTimeMillis());
            System.out.println("B end time=" + System.currentTimeMillis());
        }
    }
}
