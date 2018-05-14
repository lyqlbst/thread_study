package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo_5;

class MyThread2 extends Thread {
    private MyOneList list;

    MyThread2(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list, "B");
    }
}
