package thread._2_concurrency._1_synchronized_method_part._4_method_and_object;

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
