package thread._5_timer._1_use._5_scheduleAtFixedRate._1_schedule_no_delay_date;

import java.util.TimerTask;

class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("begin timer=" + System.currentTimeMillis());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end timer=" + System.currentTimeMillis());
    }
}
