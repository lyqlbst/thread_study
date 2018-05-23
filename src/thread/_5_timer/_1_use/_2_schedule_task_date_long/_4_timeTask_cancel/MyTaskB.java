package thread._5_timer._1_use._2_schedule_task_date_long._4_timeTask_cancel;

import java.util.Date;
import java.util.TimerTask;

class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("B run timer=" + new Date());
    }
}
