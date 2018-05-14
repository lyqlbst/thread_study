package thread._2_concurrency._2_synchronized_code_blocks_part._15_synchronized_objcet_change._2_demo;

class Service {
    void serviceMethodA(UserInfo userInfo) {
        synchronized (userInfo) {
            System.out.println(Thread.currentThread().getName());
            userInfo.setUserName("abcabcabc");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end! time=" + System.currentTimeMillis());
        }
    }
}
