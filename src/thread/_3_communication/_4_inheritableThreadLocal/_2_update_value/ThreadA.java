package thread._3_communication._4_inheritableThreadLocal._2_update_value;

class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("在ThreadA线程中读取=" + Tools.t.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
