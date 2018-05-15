package thread._2_concurrency._3_volatile_part._3_solve_async_dead_cycle;

class RunThread extends Thread {
    private boolean isRunning = true;

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning) {
        }
        System.out.println("线程被停止了");
    }

    boolean isRunning() {
        return isRunning;
    }

    void setRunning(boolean running) {
        isRunning = running;
    }
}
