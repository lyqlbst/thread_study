package thread.basic.stop.example2;

class MyThread extends Thread {
    private SychronizedObject object;

    MyThread(SychronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
