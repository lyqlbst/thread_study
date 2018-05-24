package thread._6_singleton._2_lazy_mode._3_solve._2_demo;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
