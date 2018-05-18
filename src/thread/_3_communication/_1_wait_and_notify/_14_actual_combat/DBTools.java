package thread._3_communication._1_wait_and_notify._14_actual_combat;

class DBTools {
    //变量prevIsA的主要作用就是确保备份“★★★★★”数据库A首先执行，然后“☆☆☆☆☆”数据库B交替进行备份。
    private volatile boolean prevIsA = false;

    synchronized void backupA() {
        while (prevIsA) try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) System.out.println("★★★★★");
        prevIsA = true;
        notifyAll();
    }

    synchronized void backupB() {
        while (!prevIsA) try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) System.out.println("☆☆☆☆☆");
        prevIsA = false;
        notifyAll();
    }
}
