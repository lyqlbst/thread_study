package thread._5_timer._1_use._5_scheduleAtFixedRate._7_scheduleAFR_delay_date;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 程序运行结果：任务延时的效果
 * 控制台打印的的结果证明，在延时的情况下，如果执行任务的时间被延时，
 * 那么下一次任务的执行时间是以上一次任务“结束”时的时间作为参考来计算。
 */
class MyMain {

    public static void main(String[] args) {
        Calendar calendarRef = Calendar.getInstance();
        Date runTime = calendarRef.getTime();
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, runTime, 500);
    }
}
