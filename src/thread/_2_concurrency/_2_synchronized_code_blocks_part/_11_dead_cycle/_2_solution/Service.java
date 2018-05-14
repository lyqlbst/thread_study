package thread._2_concurrency._2_synchronized_code_blocks_part._11_dead_cycle._2_solution;

class Service {
    Object object1 = new Object();

    void methodA() {
        synchronized (object1) {
            System.out.println("methodA begin");
            boolean isContinueRUn = true;
            while (isContinueRUn) {
            }
            System.out.println("methodA end");
        }
    }

    Object object2 = new Object();

    void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
