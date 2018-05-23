package thread._5_timer._1_use._1_schedule_task_date._3_multi_timers._2_demo;

import java.util.Date;
import java.util.TimerTask;

class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A begin timer="+new Date());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("A end timer="+new Date());
    }
}
