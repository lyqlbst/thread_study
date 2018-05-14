package thread._2_concurrency._2_synchronized_code_blocks_part._10_string_constant_pool._2_solution;

class Service {
    static void print(Object object) {
        synchronized (object) {
            while (true) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
