package thread.basic.stop.example1;

class MyThreadCanStop extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 5000; i++) {
                if (this.isInterrupted()) throw new InterruptedException();
                System.out.println("i=" + (i + 1));
            }
        } catch (InterruptedException e) {
            System.out.println("进入MyThreadCanStop.java类run方法中的catch方法了！");
            System.out.println("this.isInterrupted()=" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
