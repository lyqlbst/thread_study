package thread._3_communication._1_wait_and_notify._3_implementation._4_demo;

class ThreadB extends Thread {
    private Object lock;

    ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                MyList.add();
                if (MyList.size() == 5) {
                    lock.notify();
                    System.out.println("已发出通知！");
                }
                System.out.println("添加了" + (i + 1) + "个元素！");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
