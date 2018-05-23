package thread._5_timer._1_use._2_schedule_task_date_long._3_delayed;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 程序运行结果：任务被延时，但还得一个一个运行
 */
class MyMain {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND, 2);
        Date runDate = calendarRef.getTime();
        System.out.println("计划时间为：" + runDate);
        MyTaskA task = new MyTaskA();
        Timer timer = new Timer();
        timer.schedule(task, runDate, 500);
    }
}
