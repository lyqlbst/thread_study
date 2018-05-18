package thread._3_communication._1_wait_and_notify._11_producer_consumer._2_np_nc_false_dead;

class P {
    private String lock;

    P(String lock) {
        super();
        this.lock = lock;
    }

    void setValue() {
        synchronized (lock) {
            while (!"".equals(ValueObject.value)) {
                System.out.println("生产者 " + Thread.currentThread().getName() + " WAITING了★");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("生产者 " + Thread.currentThread().getName() + " RUNNABLE了");
            String value = System.currentTimeMillis() + "_" + System.nanoTime();
            ValueObject.value = value;
            lock.notify();
        }
    }
}
