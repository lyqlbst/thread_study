package thread._5_timer._1_use._2_schedule_task_date_long._2_execute_before;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 控制台打印的结果是程序运行后立即执行task任务。
 */
class MyMain {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 5);
        Date runDate = calendarRef.getTime();
        System.out.println("计划时间为：" + runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, runDate, 1000);
    }
}
