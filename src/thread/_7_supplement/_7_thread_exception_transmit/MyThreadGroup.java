package thread._7_supplement._7_thread_exception_transmit;

class MyThreadGroup extends ThreadGroup {
    MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("线程组的异常处理");
        e.printStackTrace();
    }
}
