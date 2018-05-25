package thread._7_supplement._1_thread_state._3_verify_blocked;

class MyThread1 extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
