package thread_name;

class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.start();
        Thread t = new Thread(myThread);
        t.setName("t");
        t.start();
    }
}
