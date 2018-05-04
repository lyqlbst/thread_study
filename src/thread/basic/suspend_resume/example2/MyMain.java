package thread.basic.suspend_resume.example2;

/**
 * 在使用suspend和resume方法时，如果使用不当，极易造成公共的同步对象的独占，
 * 使得其他线程无法访问公共同步对象
 */
class MyMain {

    public static void main(String[] args) {
        final SynchronizedObject object = new SynchronizedObject();
        Thread thread1 = new Thread(() -> object.printString());
        thread1.setName("a");
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(() -> {
            System.out.println("thread2线程启动了，但进入不了printString()方法！只打印了一个begin");
            System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停了！");
            object.printString();
        });
        thread2.start();
    }
}
