package thread._2_concurrency._2_synchronized_code_blocks_part._9_synchronized_static_and_class._3_verify_package_2;

class ThreadB extends Thread {
    private Service service;

    ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
