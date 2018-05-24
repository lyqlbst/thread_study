package thread._6_singleton._2_lazy_mode._1_analyze;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
