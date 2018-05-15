package thread._2_concurrency._3_volatile_part._6_atomic_class_unsafe;

class MyThread extends Thread {
    private MyService myService;

    MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
