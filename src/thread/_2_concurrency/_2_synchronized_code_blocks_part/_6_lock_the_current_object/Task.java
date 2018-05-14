package thread._2_concurrency._2_synchronized_code_blocks_part.lock_the_current_object;

class Task {
    void otherMethod() {
        System.out.println("----------------run--otherMethod");
    }

    void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++)
                System.out.println("synchronized threadName=" + Thread.currentThread().getName()
                        + " i=" + (i + 1));
        }
    }
}
