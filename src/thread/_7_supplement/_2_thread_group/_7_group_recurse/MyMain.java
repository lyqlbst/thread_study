package thread._7_supplement._2_thread_group._7_group_recurse;

/**
 * 程序运行结果：传入true，递归的获取到线程组的信息
 */
class MyMain {

    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup groupA = new ThreadGroup(mainGroup, "A");
        Runnable runnable = () -> {
            System.out.println("runMethod");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ThreadGroup groupB = new ThreadGroup(groupA, "B");
        // 分配空间，但不一定全部用完
        ThreadGroup[] groups1 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        // 传入true是递归取得子组及子孙组
        Thread.currentThread().getThreadGroup().enumerate(groups1, true);
        for (ThreadGroup threadGroup : groups1) if (threadGroup != null) System.out.println(threadGroup.getName());
        ThreadGroup[] groups2 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(groups2,false);
        for (ThreadGroup threadGroup : groups2) if (threadGroup != null) System.out.println(threadGroup.getName());
    }
}
