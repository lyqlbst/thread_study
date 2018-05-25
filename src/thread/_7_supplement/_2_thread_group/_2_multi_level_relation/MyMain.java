package thread._7_supplement._2_thread_group._2_multi_level_relation;

/**
 * 所谓的多记管理间就是父对象中有子对象，子对象中再创建子对象，也就是出现子孙对象的效果了。
 * 但是此种写法在开发中不太常见，如果线程树结构设计得非常复杂反而不利于线程对象的管理，
 * 但JDK却踢动了支持多及关联的线程树结构。
 * 本程序代码的结构就是main组创建一个新组，然后又在该新租中添加了线程。
 */
class MyMain {

    public static void main(String[] args) {
        // 在main组中添加一个线程组A，然后在这个A组中添加线程对象Z
        // 方法activeGroupCount()和activeCount()的值不是固定的
        // 是系统中环境的一个快照
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(mainGroup, "A");
        Runnable runnable = () -> {
            System.out.println("runMethod!");
            try {
                Thread.sleep(500);  // 线程必须在运行状态才可以受组管理
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread newThread = new Thread(group, runnable);
        newThread.setName("Z");
        newThread.start();  // 线程必须启动然后才归到组A中
        ThreadGroup[] groups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groups);
        System.out.println("main线程中有多少个子线程组：" + groups.length + " 名字为：" + groups[0].getName());
        Thread[] threads = new Thread[groups[0].activeCount()];
        groups[0].enumerate(threads);
        System.out.println(threads[0].getName());
    }
}
