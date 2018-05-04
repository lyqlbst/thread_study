package thread.basic.daemon;

class MyThread extends Thread {
    private int i =0;

    @Override
    public void run() {
        try {
            while (true){
                i++;
                System.out.println("i="+(i));
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
