package thread._3_communication._2_join._4_join_long;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("begin Timer=" + System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
