package thread._5_timer._1_use._4_schedule_task_long_long;

import java.util.Date;
import java.util.Timer;

/**
 * 方法schedule(TimerTask task, long delay, long period)的作用是以当前的时间为参考时间，
 * 在此时间基础上延迟指定的毫秒数，再以某一间隔时间无限次数地执行某一任务。
 * 程序运行结果：任务被延迟2秒执行了，每1秒执行一次。
 * 凡是使用方法中带有period参数的，都是无限循环执行TimerTask中的任务。
 */
class MyMain {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间：" + new Date());
        timer.schedule(task, 2000,1000);
    }
}
