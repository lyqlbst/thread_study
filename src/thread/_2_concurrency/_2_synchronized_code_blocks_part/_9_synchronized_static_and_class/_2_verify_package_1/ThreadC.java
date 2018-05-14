package thread._2_concurrency._2_synchronized_code_blocks_part._9_synchronized_static_and_class._2_verify_package_1;

class ThreadC extends Thread {
    private Service service;

    ThreadC(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
