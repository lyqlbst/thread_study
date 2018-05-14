package thread.concurrency.synchronized_code_bock_part.half_synchronized_half_asynchronized;

class Task {
    void doLongTimeTask() {
        for (int i = 0; i < 100; i++)
            System.out.println("no synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
        System.out.println();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            for (int i = 0; i < 100; i++)
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
        }
    }
}
