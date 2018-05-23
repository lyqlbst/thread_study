package thread._5_timer._1_use._1_schedule_task_date._1_execute_future;

import java.util.Date;
import java.util.TimerTask;

class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("任务执行了，时间为：" + new Date());
    }
}
