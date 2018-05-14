package thread.concurrency.synchronized_method_part.instance_variable;

class ThreadA extends Thread{
    private HasSelfPrivateNum numRef;
    ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
