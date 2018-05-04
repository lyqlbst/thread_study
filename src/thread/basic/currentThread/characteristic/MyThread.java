package thread.basic.currentThread.characteristic;

class MyThread extends Thread {

    MyThread(){
        System.out.println("构造方法的打印："+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印："+ Thread.currentThread().getName());
    }
}
