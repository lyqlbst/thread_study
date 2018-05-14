package thread._2_concurrency._2_synchronized_code_blocks_part._11_dead_cycle._2_solution;

class ThreadA extends Thread {
    private Service service;

    ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
