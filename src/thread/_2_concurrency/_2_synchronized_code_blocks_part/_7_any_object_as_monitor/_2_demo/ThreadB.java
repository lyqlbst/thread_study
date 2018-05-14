package thread._2_concurrency._2_synchronized_code_blocks_part._7_any_object_as_monitor._2_demo;

class ThreadB extends Thread {
    private Service service;

    ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUserNamePassword("b", "bb");
    }
}
