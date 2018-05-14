package thread._2_concurrency._1_synchronized_method_part._6_reentrant._1_rentrant;

class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
