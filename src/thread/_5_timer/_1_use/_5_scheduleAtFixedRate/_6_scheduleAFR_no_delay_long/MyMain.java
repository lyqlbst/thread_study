package thread._5_timer._1_use._5_scheduleAtFixedRate._6_scheduleAFR_no_delay_long;

import java.util.Timer;

/**
 * 程序运行效果：没有延时的运行效果
 * 控制台打印的的结果证明，在不延时的情况下，如果执行任务的时间没有被延时，
 * 则第一次执行任务的时间是任务开始时间加上delay时间，接下来执行任务的时间是上一次任务的开始时间加上period时间。
 */
class MyMain {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间;" + System.currentTimeMillis());
        timer.scheduleAtFixedRate(task, 2000, 2000);
    }
}
