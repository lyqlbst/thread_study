package thread.basic.suspend_resume.example1;

class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(500);
            myThread.suspend();
            System.out.println("A= " + System.currentTimeMillis() + " i= " + myThread.getI());
            Thread.sleep(1000);
            System.out.println("A= " + System.currentTimeMillis() + " i= " + myThread.getI());
            myThread.resume();
            Thread.sleep(500);
            myThread.suspend();
            System.out.println("B= " + System.currentTimeMillis() + " i= " + myThread.getI());
            Thread.sleep(500);
            System.out.println("B= " + System.currentTimeMillis() + " i= " + myThread.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
