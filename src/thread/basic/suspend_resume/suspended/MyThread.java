package thread.basic.suspend_resume.suspended;

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
