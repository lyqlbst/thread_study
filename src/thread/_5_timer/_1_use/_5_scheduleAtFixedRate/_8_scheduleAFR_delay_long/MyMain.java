package thread._5_timer._1_use._5_scheduleAtFixedRate._8_scheduleAFR_delay_long;

import java.util.Timer;

/**
 * 程序运行结果：任务延时的效果
 * 控制台打印的的结果证明，在延时的情况下，如果执行任务的时间被延时，
 * 那么下一次任务的执行时间是以上一次任务“结束”时的时间作为参考来计算。
 * 从上面8个代码的运行结果来看，方法schedule和方法scheduleAtFixedRate并没有运行效果上的区别，那么它们之间有什么区别呢？
 * 那就是追赶性。
 */
class MyMain {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间：" + System.currentTimeMillis());
        timer.scheduleAtFixedRate(task, 1000, 500);
    }
}
