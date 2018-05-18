package thread._3_communication._1_wait_and_notify._5_met_interrupt;

class Service {
    void testMethod(Object lock){
        synchronized (lock){
            System.out.println("begin wait()");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("出现异常了，因为呈wait状态的线程被interrupt了！");
            }
            System.out.println("end wait()");
        }
    }
}
