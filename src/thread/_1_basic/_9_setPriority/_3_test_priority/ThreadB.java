package thread._1_basic._9_setPriority._3_test_priority;

class ThreadB extends Thread {
    private int count = 0;

    int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) count++;
    }
}
