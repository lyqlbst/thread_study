package thread._5_timer._1_use._2_schedule_task_date_long._6_timer_cancel_attention;

import java.util.TimerTask;

class MyTaskA extends TimerTask {
    private int i;

    MyTaskA(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("第" + (i + 1) + "次没有被cancel取消");
    }
}
