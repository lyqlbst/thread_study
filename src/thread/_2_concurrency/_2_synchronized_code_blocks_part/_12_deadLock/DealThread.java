package thread._2_concurrency._2_synchronized_code_blocks_part._12_deadLock;

class DealThread implements Runnable {
    private String userName;
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    void setFlag(String userName) {
        this.userName = userName;
    }

    @Override
    public void run() {
        if ("a".equals(userName)) {
            synchronized (lock1) {
                System.out.println("userName = " + userName);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("按lock1->lock2代码顺序执行了");
                }
            }
        }
        if ("b".equals(userName)) {
            synchronized (lock2) {
                System.out.println("userName = " + userName);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("按lock2->lock1代码顺序执行了");
                }
            }
        }
    }
}
