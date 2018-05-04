package thread.basic.isAlive;

class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread);
        System.out.println("main begin t isAlive=" + t.isAlive());
        t.setName("A");
        t.start();
        System.out.println("main end t isAlive=" + t.isAlive());
    }
}
