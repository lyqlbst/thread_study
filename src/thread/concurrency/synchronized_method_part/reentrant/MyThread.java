package thread.concurrency.synchronized_method_part.reentrant;

class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
