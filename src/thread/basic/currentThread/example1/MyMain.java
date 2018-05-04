package thread.basic.currentThread.example1;

/**
 * 水调用的run方法，Thread.currentThread().getName()就显示调用线程的名字
 * main方法直接调用run()方法的话，getName()显示当然是main了
 */
class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.start();
        myThread.run();
    }
}
