package thread._1_basic._6_stop._1_inconsistency_code;

/**
 * Thread.stop释放所将会给数据造成不一致性的结果
 * stop()方法已经再JDK标明是“作废/过期”的方法，不建议使用
 */
class MyMain {

    public static void main(String[] args) {
        SynchronizedObject object = new SynchronizedObject();
        MyThread myThread = new MyThread(object);
        myThread.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.stop();
        System.out.println(object.getUserName() + " " + object.getPassword());
    }
}
