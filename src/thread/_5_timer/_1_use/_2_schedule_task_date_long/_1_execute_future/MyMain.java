package thread._5_timer._1_use._2_schedule_task_date_long._1_execute_future;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 从运行结果来看是每隔1秒运行一次TimerTask任务，并且是无期限重复执行TimerTask任务。
 */
class MyMain {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND, 2);
        Date runDate = calendarRef.getTime();
        System.out.println("计划时间为：" + runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, runDate, 1000);
    }
}
