package thread._2_concurrency._1_synchronized_method_part._4_method_and_object;

class MyObject {
    synchronized void methodA() {
        System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end endTime=" + System.currentTimeMillis());
    }

    void methodB() {
        System.out.println("begin methodB threadName=" + Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end endTime=" + System.currentTimeMillis());
    }
}
