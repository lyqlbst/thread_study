package thread._5_timer._1_use._5_scheduleAtFixedRate._10_schedule_AFR_catchability;

import java.util.Date;
import java.util.TimerTask;

class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("begin timer=" + new Date());
        System.out.println("end timer=" + new Date());
    }
}
