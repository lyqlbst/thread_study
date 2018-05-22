package thread._3_communication._3_threadLocal._2_verify_isolation._2_demo;

import java.util.Date;

class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (Tools.t.get() == null) {
                Tools.t.set(new Date());
            }
            System.out.println("A " + Tools.t.get().getTime());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
