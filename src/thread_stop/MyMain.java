package thread_stop;

class MyMain {

    public static void main(String[] args) {
        MyThreadCanStop thread = new MyThreadCanStop();
        thread.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("是否停止？="+thread.isInterrupted());
    }
}