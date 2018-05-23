package thread._5_timer._1_use._2_schedule_task_date_long._3_delayed;

import java.util.Date;
import java.util.TimerTask;

class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A begin timer=" + new Date());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("A end timer=" + new Date());
    }
}
