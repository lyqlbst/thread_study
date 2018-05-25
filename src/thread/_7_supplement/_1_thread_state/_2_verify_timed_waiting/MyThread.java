package thread._7_supplement._1_thread_state._2_verify_timed_waiting;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("begin sleep");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end sleep");
    }
}
