package thread._2_concurrency._2_synchronized_code_blocks_part.solve_synchronized_method_disadvantages;

class Task {
    private String getData1;
    private String getData2;

    void doLongTimeTask() {
        System.out.println("begin task");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String privateGetData1 = "长时间处理任务后从远程返回的值 1 threadName=" + Thread.currentThread().getName();
        String privateGetData2 = "长时间处理任务后从远程返回的值 2 threadName=" + Thread.currentThread().getName();
        synchronized (this) {
            getData1 = privateGetData1;
            getData2 = privateGetData2;
        }
        System.out.println(getData1);
        System.out.println(getData2);
        System.out.println("end task");
    }
}
