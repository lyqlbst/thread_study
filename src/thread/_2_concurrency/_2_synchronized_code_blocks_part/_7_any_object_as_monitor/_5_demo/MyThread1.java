package thread._2_concurrency._2_synchronized_code_blocks_part._7_any_object_as_monitor._5_demo;

class MyThread1 extends Thread {
    private MyOneList list;

    MyThread1(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list, "A");
    }
}
