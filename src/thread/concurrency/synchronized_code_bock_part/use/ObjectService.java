package thread.concurrency.synchronized_code_bock_part.use;

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
