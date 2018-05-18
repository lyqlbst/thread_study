package thread._3_communication._1_wait_and_notify._10_condition_changed;

class Add {
    private String lock;

    Add(String lock) {
        super();
        this.lock = lock;
    }

    void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
