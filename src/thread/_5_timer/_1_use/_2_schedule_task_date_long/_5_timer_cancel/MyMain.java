package thread._5_timer._1_use._2_schedule_task_date_long._5_timer_cancel;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 和TImerTask类中的cancel()方法清除自身不同，Timer类中的cancel()方法作用是将任务队列中全的任务进行清空。
 * 任务运行结果：全部的任务都被清除，并且进程被销毁，按钮由红色变成灰色。
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
    }
}
