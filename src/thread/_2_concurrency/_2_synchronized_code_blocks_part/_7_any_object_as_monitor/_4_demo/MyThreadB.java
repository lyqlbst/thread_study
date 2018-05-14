package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo_4;

class MyThreadB extends Thread {
    private MyList list;

    MyThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) list.add("threadB" + (i + 1));
    }
}
