package thread._5_timer._1_use._1_schedule_task_date._3_multi_timers._2_demo;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 程序运行结果：任务2的运行时间被延时
 * 在代码中设置任务1和任务2的运行间隔时间为1秒，由于task1需要用时2秒执行完任务，所以task1结束时间就是task2的开始时间，
 * 不再以1秒作为参考，究其原理还是因为Task是放入队列的，得一个一个运行。
 */
class MyMain {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + new Date());
        Calendar calendarRef1 = Calendar.getInstance();
        Date runDate1 = calendarRef1.getTime();
        System.out.println("A计划时间为：" + runDate1);
        Calendar calendarRef2 = Calendar.getInstance();
        calendarRef2.add(Calendar.SECOND, 1);
        Date runDate2 = calendarRef1.getTime();
        System.out.println("B计划时间为：" + runDate2);
        MyTaskA task1 = new MyTaskA();
        MyTaskB task2 = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(task1, runDate1);
        timer.schedule(task2, runDate2);
    }
}
