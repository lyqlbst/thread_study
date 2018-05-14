package thread._2_concurrency._2_synchronized_code_blocks_part._4_half_synchronized_half_asynchronized;

class Task {
    void doLongTimeTask() {
        for (int i = 0; i < 100; i++)
            System.out.println("no synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
        System.out.println();
        synchronized (this) {
            for (int i = 0; i < 100; i++)
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
        }
    }
}
