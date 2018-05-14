package thread._2_concurrency._1_synchronized_method_part._7_exception_auto_release;

class ThreadB extends Thread {
    private Service service;

    ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
