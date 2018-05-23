package thread._5_timer._1_use._2_schedule_task_date_long._5_timer_cancel;

import java.util.Date;
import java.util.TimerTask;

class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A run timer=" + new Date());
    }
}
