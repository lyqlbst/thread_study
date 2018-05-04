package thread.basic.getName;

class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.extends_Thread();
        Thread t = new Thread(myThread);
        t.setName("t");
        t.start();
    }
}
