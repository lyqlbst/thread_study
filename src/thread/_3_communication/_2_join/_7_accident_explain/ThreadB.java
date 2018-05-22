package thread._3_communication._2_join._7_accident_explain;

class ThreadB extends Thread {
    @Override
    public synchronized void run() {
        System.out.println("begin B ThreadName=" + Thread.currentThread().getName()
                + "  " + System.currentTimeMillis());
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end B ThreadName=" + Thread.currentThread().getName()
                + "  " + System.currentTimeMillis());
    }
}
