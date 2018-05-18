package thread._3_communication._1_wait_and_notify._1_without_wait_and_notify;

class ThreadA extends Thread {
    private MyList list;

    ThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            list.add();
            System.out.println("添加了" + (i + 1) + "个元素");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
