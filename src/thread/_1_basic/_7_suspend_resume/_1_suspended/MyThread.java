package thread._1_basic._7_suspend_resume._1_suspended;

class MyThread extends Thread {
    private long i = 0;

    long getI() {
        return i;
    }

    void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        while (true) i++;
    }
}
