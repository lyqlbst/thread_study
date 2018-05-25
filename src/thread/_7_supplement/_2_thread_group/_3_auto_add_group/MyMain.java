package thread._7_supplement._2_thread_group._3_auto_add_group;

/**
 * 自动归属就是自动归到当前线程组中。
 * 本实验要证明的是，在实例化一个ThreadGroup线程组x时如果不指定所属的线程组，
 * 则线程组自动归到当前线程对象所属的线程组中，也就是隐式地在一个线程组中添加了一个自线程组，
 * 所以在控制台中打印的线程组数量值由0变成了1。
 */
class MyMain {

    public static void main(String[] args) {
        // 方法activeGroupCount()取得当前线程组对象中的子线程组数量
        // 方法enumerate()的作用是将线程组中的子线程组以复制的形式拷贝到ThreadGroup[]数组对象中
        System.out.println("A处线程：" + Thread.currentThread().getName()
                + " 所属的线程组名为：" + Thread.currentThread().getThreadGroup().getName()
                + " 中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup("新的线程组");   // 自动加到main组中
        System.out.println("B处线程：" + Thread.currentThread().getName()
                + " 所属的线程组名为：" + Thread.currentThread().getThreadGroup().getName()
                + " 中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup[] groups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groups);
        for (ThreadGroup threadGroup : groups) System.out.println("第一个线程组名称为：" + threadGroup.getName());
    }
}
