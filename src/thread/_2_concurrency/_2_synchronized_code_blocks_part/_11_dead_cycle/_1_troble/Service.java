package thread._2_concurrency._2_synchronized_code_blocks_part._11_dead_cycle._1_troble;

class Service {
    synchronized void methodA() {
        System.out.println("methodA begin");
        boolean isContinueRun = true;
        while (isContinueRun) {
        }
        System.out.println("methodA end");
    }

    synchronized void methodB() {
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
