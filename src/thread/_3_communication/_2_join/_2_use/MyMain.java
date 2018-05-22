package thread._3_communication._2_join._2_use;

/**
 * 方法join的作用是使所属的线程对象x正常执行run()方法中的任务，而使当前线程z进行无期限的阻塞，
 * 等待线程x销毁后再继续执行线程z后面的代码。
 * 方法join具有使线程排队运行的作用，有些类似同步的运行效果。join与synchronized的区别是：
 * join在内部使用wait()方法进行等待，而synchronized关键字使用的是“对象监视器”原理作为同步。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我想当thread对象执行完毕后我在执行，我做到了");
    }
}
