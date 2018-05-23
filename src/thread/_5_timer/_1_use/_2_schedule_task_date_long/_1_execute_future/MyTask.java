package thread._5_timer._1_use._2_schedule_task_date_long._1_execute_future;

import java.util.Date;
import java.util.TimerTask;

class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行了，时间是：" + new Date());
    }
}
