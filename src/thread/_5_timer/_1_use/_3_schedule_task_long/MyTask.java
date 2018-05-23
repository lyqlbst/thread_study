package thread._5_timer._1_use._3_schedule_task_long;

import java.util.Date;
import java.util.TimerTask;

class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("运行了！时间为：" + new Date());
    }
}
