package thread._5_timer._1_use._2_schedule_task_date_long._6_timer_cancel_attention;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Timer类中的cancel()方法有时并不一定会停止计划任务，而是正常执行。
 * 原因是Timer类中的cancel()方法有时并没有正抢到queue锁，则让TimeTask类中的任务正常执行。
 */
class MyMain {

    public static void main(String[] args) {
        int i = 0;
        Calendar calendarRef = Calendar.getInstance();
        Date runDate = calendarRef.getTime();
        while (true) {
            i++;
            Timer timer = new Timer();
            MyTaskA task = new MyTaskA(i);
            timer.schedule(task, runDate);
            timer.cancel();
        }
    }
}
