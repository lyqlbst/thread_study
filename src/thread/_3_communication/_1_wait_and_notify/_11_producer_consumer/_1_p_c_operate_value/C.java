package thread._3_communication._1_wait_and_notify._11_producer_consumer._1_p_c_operate_value;

class C {
    private String lock;

    C(String lock) {
        super();
        this.lock = lock;
    }

    void getValue() {
        synchronized (lock) {
            if ("".equals(ValueObject.value)) try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("get的值是" + ValueObject.value);
            ValueObject.value = "";
            lock.notify();
        }
    }
}
