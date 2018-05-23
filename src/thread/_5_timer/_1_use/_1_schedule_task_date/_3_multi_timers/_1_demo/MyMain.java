package thread._5_timer._1_use._1_schedule_task_date._3_multi_timers._1_demo;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * TimerTask是以队列的方式一个一个被顺序地执行，所以执行的时间有可能和预期的时间不一致，
 * 因为前面的任务有可能消耗的时间较长，则后面的任务运行的时间也被延后。
 * 运行结果：1个Timer中可以运行多个TimerTask任务
 */
class MyMain {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef1 = Calendar.getInstance();
        calendarRef1.add(Calendar.SECOND, 2);
        Date runDate1 = calendarRef1.getTime();
        System.out.println("计划时间为：" + runDate1);
        Calendar calendarRef2 = Calendar.getInstance();
        calendarRef2.add(Calendar.SECOND, 5);
        Date runDate2 = calendarRef1.getTime();
        System.out.println("计划时间为：" + runDate2);
        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task1, runDate1);
        timer.schedule(task2, runDate2);
    }
}
