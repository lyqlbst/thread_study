package thread._2_concurrency._2_synchronized_code_blocks_part._10_string_constant_pool._2_solution;

class ThreadA extends Thread {
    private Service service;

    ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.print(new Object());
    }
}
