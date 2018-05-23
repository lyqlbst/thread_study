package thread._5_timer._1_use._1_schedule_task_date._1_execute_future;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 任务虽然执行完了，但进程还未销毁，呈红色状态，为什么会出现这样的情况？
 * 在创建Timer对象时，JDK源代码如下：
 * public Timer() {
 *     this("Timer-" + serialNumber);
 * }
 * 此构造方法调用的是如下的构造方法：
 * public Timer(String name) {
 *     thread.setName(name);
 *     thread.start();
 * }
 * 查看构造方法可以得知，创建1个Timer就是启动1个新的线程，那么这个新启动的线程并不是守护线程，一直在运行。
 * 下一步将新创建的Timer改成守护线程：
 * Timer timer = new Timer(true); // 守护线程
 * 程序运行结果：程序运行后迅速结束当前的进程，并且TimerTask中的任务不被运行，因为进程已经结束。
 */
class MyMain {

    public static void main(String[] args) {
        System.out.println("当前时间为：" + System.currentTimeMillis());
        Calendar calendarRef = Calendar.getInstance();
        calendarRef.add(Calendar.SECOND, 3);
        Date runDate = calendarRef.getTime();
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task, runDate);
    }
}
