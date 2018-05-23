package thread._5_timer._1_use._1_schedule_task_date._3_multi_timers._2_demo;

import java.util.Date;
import java.util.TimerTask;

class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("B begin timer=" + new Date());
        System.out.println("B end timer=" + new Date());
    }
}
