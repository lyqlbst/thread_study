package thread.concurrency.synchronized_method_part.method_and_object;

class ThreadA extends Thread{
    private MyObject object;

    ThreadA(MyObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
