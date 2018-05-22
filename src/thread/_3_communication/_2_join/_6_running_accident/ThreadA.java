package thread._3_communication._2_join._6_running_accident;

class ThreadA extends Thread {
    private ThreadB b;

    ThreadA(ThreadB b) {
        super();
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (b) {
            System.out.println("begin A ThreadName=" + Thread.currentThread().getName()
                    + "  " + System.currentTimeMillis());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end A ThreadName=" + Thread.currentThread().getName()
                    + "  " + System.currentTimeMillis());
        }
    }
}
