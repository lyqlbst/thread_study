package thread._5_timer._1_use._3_schedule_task_long;

import java.util.Date;
import java.util.Timer;

/**
 * 方法schedule(TimerTask task, long delay)的作用是以当前的时间为参考时间，
 * 在此时间基础上延迟指定的毫秒数后执行一次TimerTask任务。
 * 程序运行结果：任务被延迟1秒执行了。
 */
class MyMain {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间：" + new Date());
        timer.schedule(task, 1000);
    }
}
