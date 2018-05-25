package thread._7_supplement._1_thread_state._4_verify_waiting;

class MyThread extends Thread{
    @Override
    public void run() {
        synchronized (Lock.lock){
            try {
                Lock.lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
