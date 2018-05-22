package thread._3_communication._3_threadLocal._4_verify_isolaion_again;

class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("在ThreadA线程中取值=" + Tools.t.get());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
