package thread._2_concurrency._3_volatile_part._7_synchronize_code_blocks;

class Service {
    private boolean isContinueRun = true;

    void runMethod() {
        while (isContinueRun) {
        }
        System.out.println("停下来了！");
    }

    void stopMethod() {
        isContinueRun = false;
    }
}
