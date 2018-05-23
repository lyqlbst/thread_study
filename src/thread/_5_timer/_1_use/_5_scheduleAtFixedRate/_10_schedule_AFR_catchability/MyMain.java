package thread._5_timer._1_use._5_scheduleAtFixedRate._10_schedule_AFR_catchability;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 程序运行结果：追赶
 * 将两个时间段内的时间所对应的Task任务被“补充性”地执行，这就是Task任务追赶特性。
 */
class MyMain {

    public static void main(String[] args) {
        System.out.println("现在执行时间：" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.set(Calendar.SECOND, calendarRef.get(Calendar.SECOND) - 10);
        Date runDate = calendarRef.getTime();
        System.out.println("计划执行时间：" + runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, runDate, 1000);
    }
}
