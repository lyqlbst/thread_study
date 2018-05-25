package thread._7_supplement._3_thread_orderly;

class MyThread extends Thread {
    private Object lock;
    private String showChar;
    private int showNumPosition;
    private int printCount; // 统计打印了几个字母
    private volatile static int addNum = 1;

    MyThread(Object lock, String showChar, int showNumPosition) {
        super();
        this.lock = lock;
        this.showChar = showChar;
        this.showNumPosition = showNumPosition;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                if (addNum % 3 == showNumPosition) {
                    System.out.println("ThreadName=" + Thread.currentThread().getName()
                            + " runCount=" + addNum + " " + showChar);
                    lock.notifyAll();
                    addNum++;
                    printCount++;
                    if (printCount == 3) break;
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
