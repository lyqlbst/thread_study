package thread._2_concurrency._2_synchronized_code_blocks_part._10_string_constant_pool._1_trouble;

class Service {
    static void print(String stringParam){
        synchronized (stringParam){
            while (true){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
