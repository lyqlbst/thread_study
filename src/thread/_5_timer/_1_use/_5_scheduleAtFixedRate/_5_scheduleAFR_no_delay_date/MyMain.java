package thread._5_timer._1_use._5_scheduleAtFixedRate._5_scheduleAFR_no_delay_date;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 程序运行效果：没有延时的运行效果
 * 控制台打印的的结果证明，在不延时的情况下，如果执行任务的时间没有被延时，
 * 则下一次执行任务的开始时间上一次任务的开始时间加上period时间。
 */
class MyMain {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Calendar calendarRef = Calendar.getInstance();
        Date runDate = calendarRef.getTime();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, runDate, 2000);
    }
}
