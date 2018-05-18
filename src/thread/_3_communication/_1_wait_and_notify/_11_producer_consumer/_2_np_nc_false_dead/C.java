package thread._3_communication._1_wait_and_notify._11_producer_consumer._2_np_nc_false_dead;

class C {
    private String lock;

    C(String lock) {
        super();
        this.lock = lock;
    }

    void getValue() {
        synchronized (lock) {
            while ("".equals(ValueObject.value)) {
                System.out.println("消费者 " + Thread.currentThread().getName() + " WAITING了☆");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNABLE了");
            ValueObject.value = "";
            lock.notify();
        }
    }
}
