package thread._3_communication._1_wait_and_notify._4_about_release._1_demo;

class Service {
    void testMethod(Object lock) {
        synchronized (lock) {
            System.out.println("begin wait()");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end wait()");
        }
    }
}
