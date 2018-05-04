package thread.basic.setPriority.example4;

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
