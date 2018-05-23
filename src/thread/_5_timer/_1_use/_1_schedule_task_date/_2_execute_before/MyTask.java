package thread._5_timer._1_use._1_schedule_task_date._2_execute_before;

import java.util.Date;
import java.util.TimerTask;

class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行了，时间为：" + new Date());
    }
}
