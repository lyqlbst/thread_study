package thread._3_communication._2_join._1_preparation;

class MyThread extends Thread {
    @Override
    public void run() {
        int secondValue = (int) (Math.random() * 1000);
        System.out.println(secondValue);
        try {
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
