package thread.basic.stop.inconsistency_code;

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
