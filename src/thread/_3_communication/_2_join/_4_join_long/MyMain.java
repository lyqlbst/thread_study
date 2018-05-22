package thread._3_communication._2_join._4_join_long;

/**
 * 方法join(long)中的参数是设定等待时间。
 * 但将main方法中的代码改成sleep(500)方法时，运行的效果还是等待了2秒
 * 使用join(500)和sleep(500)有什么区别呢？上面的示例在运行效果上并没有区别，
 * 其实区别主要还是来自于这两个方法对同步的处理上。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join(500);   // 只等0.4秒
//            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end timer=" + System.currentTimeMillis());
    }
}
