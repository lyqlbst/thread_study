package thread._3_communication._1_wait_and_notify._14_actual_combat;

/**
 * 本示例的目的是要继续学习等待/通知相关的知识点，创建20个线程，其中10个线程是将数据备份到A数据库，
 * 另外10个线程将数据被分到B数据库中，并且备份A数据库和B数据库是交叉进行的。
 * 首先创建出20个线程，效果如下：
 * ●●●○●○●○○●○●●○○○●○○●
 * 通过一些手段将这20个线程的运行效果变成有序的，效果如下：
 * ●○●○●○●○●○●○●○●○●○●○
 * 使用的技术还是等待/通知
 *
 * 运行结果：交替运行
 * 交替打印的原理就是使用如下代码作为标记：
 * volatile boolean provIsA = true;
 * 实现了A和B线程交替备份的效果。
 */
class MyMain {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }
}
