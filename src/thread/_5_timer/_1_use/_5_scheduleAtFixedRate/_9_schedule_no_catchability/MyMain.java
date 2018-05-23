package thread._5_timer._1_use._5_scheduleAtFixedRate._9_schedule_no_catchability;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 时间“Wed May 23 18:01:05 CST 2018”到“Wed May 23 18:01:15 CST 2018”之间的时间所对应的Task任务就被取消掉，
 * 不被执行了，这就是Task任务不追赶。
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
        timer.schedule(task, runDate, 1000);
    }
}
