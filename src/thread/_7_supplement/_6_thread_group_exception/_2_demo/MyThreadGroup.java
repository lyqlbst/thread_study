package thread._7_supplement._6_thread_group_exception._2_demo;

class MyThreadGroup extends ThreadGroup {
    MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        this.interrupt();
    }
}
