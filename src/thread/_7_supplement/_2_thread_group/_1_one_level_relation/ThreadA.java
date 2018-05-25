package thread._7_supplement._2_thread_group._1_one_level_relation;

class ThreadA extends Thread {
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
