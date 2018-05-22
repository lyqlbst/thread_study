package thread._3_communication._3_threadLocal._2_verify_isolation._1_demo;

class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Tools.t.set("ThreadB" + (i + 1));
            System.out.println("ThreadB get Value=" + Tools.t.get());
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
