package thread._3_communication._1_wait_and_notify._11_producer_consumer._1_p_c_operate_value;

class P {
    private String lock;

    P(String lock) {
        super();
        this.lock = lock;
    }

    void setValue() {
        synchronized (lock) {
            if (!"".equals(ValueObject.value)) try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String value = System.currentTimeMillis() + "_" + System.nanoTime();
            System.out.println("set的值是" + value);
            ValueObject.value = value;
            lock.notify();
        }
    }
}
