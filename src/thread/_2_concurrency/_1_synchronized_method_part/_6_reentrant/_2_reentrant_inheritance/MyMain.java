package thread._2_concurrency._1_synchronized_method_part._6_reentrant._2_reentrant_inheritance;

/**
 * 当存在父子类继承关系时，子类是完全可以通过“可重入锁”调用父类的同步方法的。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
