package thread._1_basic._6_stop._1_inconsistency_code;

class MyThread extends Thread {
    private SynchronizedObject object;

    MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
