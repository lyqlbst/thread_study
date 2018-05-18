package thread._3_communication._1_wait_and_notify._7_notify_all;

class NotifyThread extends Thread{
    private Object lock;

    NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            lock.notifyAll();
        }
    }
}
