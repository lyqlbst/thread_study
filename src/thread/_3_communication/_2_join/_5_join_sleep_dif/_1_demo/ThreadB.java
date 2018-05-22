package thread._3_communication._2_join._5_join_sleep_dif._1_demo;

class ThreadB extends Thread {
    @Override
    public void run() {
        System.out.println("b run begin timer=" + System.currentTimeMillis());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("b run end timer=" + System.currentTimeMillis());
    }

    synchronized void bService() {
        System.out.println("打印了bService timer=" + System.currentTimeMillis());
    }
}
