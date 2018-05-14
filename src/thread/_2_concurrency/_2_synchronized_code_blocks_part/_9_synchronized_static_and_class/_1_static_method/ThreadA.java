package thread._2_concurrency._2_synchronized_code_blocks_part._9_synchronized_static_and_class._1_static_method;

class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}
