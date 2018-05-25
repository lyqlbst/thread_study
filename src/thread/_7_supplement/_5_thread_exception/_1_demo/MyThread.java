package thread._7_supplement._5_thread_exception._1_demo;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(((String) null).hashCode());
    }
}
