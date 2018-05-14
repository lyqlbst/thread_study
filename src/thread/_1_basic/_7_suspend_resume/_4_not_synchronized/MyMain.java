package thread._1_basic._7_suspend_resume._4_not_synchronized;

/**
 * 在使用suspend和resume方法时也容易出现因为线程的暂停而导致数据不同步的情况，使用时需格外注意
 */
class MyMain {

    public static void main(String[] args) {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread(() -> myObject.setValue("a", "aa"));
        thread1.setName("a");
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(myObject::printUserNamePassword);
        thread2.start();
    }
}
