package thread._7_supplement._1_thread_state._3_verify_blocked;

class MyService {
    synchronized static void serviceMethod() {
        System.out.println(Thread.currentThread().getName() + "进入了业务方法！");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
