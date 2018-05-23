package thread._5_timer._1_use._2_schedule_task_date_long._4_timeTask_cancel;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * TimerTask类中的cancel()方法的作用是将自身从任务队列中进行清除。
 * 程序运行结果：TimerTaskA仅运行一次后被取消了
 */
class MyMain {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        Date runDate = calendarRef.getTime();
        System.out.println("计划时间为：" + runDate);
        MyTaskA task1 = new MyTaskA();
        MyTaskB task2 = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(task1, runDate, 1000);
        timer.schedule(task2, runDate, 1000);
    }
}
