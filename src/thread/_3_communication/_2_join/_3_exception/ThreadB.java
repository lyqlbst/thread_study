package thread._3_communication._2_join._3_exception;

class ThreadB extends Thread {
    @Override
    public void run() {
        ThreadA a = new ThreadA();
        a.start();
        try {
            a.join();
        } catch (InterruptedException e) {
            System.out.println("线程B在catch处打印了");
            e.printStackTrace();
        }
        System.out.println("线程B在run end处打印了");
    }
}
