package thread._3_communication._1_wait_and_notify._10_condition_changed;

class Subtract {
    private String lock;

    Subtract(String lock) {
        super();
        this.lock = lock;
    }

    void subtract() {
        synchronized (lock) {
            if (ValueObject.list.size() == 0) {
                System.out.println("wait begin ThreadName=" + Thread.currentThread().getName());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait end ThreadName=" + Thread.currentThread().getName());
            }
            ValueObject.list.remove(0);
            System.out.println("list size=" + ValueObject.list.size());
        }
    }
}
