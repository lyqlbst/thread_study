package thread._3_communication._4_inheritableThreadLocal._1_value_inheritance;

class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("在ThreadA线程中读取=" + Tools.t.get());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
