package thread._2_concurrency._1_synchronized_method_part._8_not_inheritance;

class Main {
    synchronized void serviceMethod() {
        System.out.println("int main 下一步 sleep begin threadName=" + Thread.currentThread().getName()
                + " time=" + System.currentTimeMillis());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("int main 下一步 sleep end threadName=" + Thread.currentThread().getName()
                + " time=" + System.currentTimeMillis());
    }
}
