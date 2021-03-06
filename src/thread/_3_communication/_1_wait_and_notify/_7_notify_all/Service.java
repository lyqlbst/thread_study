package thread._3_communication._1_wait_and_notify._7_notify_all;

class Service {
    void testMethod(Object lock) {
        synchronized (lock) {
            System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end  wait() ThreadName=" + Thread.currentThread().getName());
        }
    }
}
