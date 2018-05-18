package thread._3_communication._1_wait_and_notify._4_about_release._2_demo;

class Service {
    void testMethod(Object lock) {
        synchronized (lock) {
            System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end wait() ThreadName=" + Thread.currentThread().getName());
        }
    }

    void synNotifyMethod(Object lock) {
        synchronized (lock) {
            System.out.println("begin notify() ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
            lock.notify();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end notify() ThreadName=" + Thread.currentThread().getName()
                    + " time=" + System.currentTimeMillis());
        }
    }
}
