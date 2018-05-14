package thread._2_concurrency._2_synchronized_code_blocks_part._7_any_object_as_monitor._1_demo;

class Service {
    private String userNameParam;
    private String passwordParam;
    private String anyString = new String();

    void setUserNamePassword(String userName, String password) {
        synchronized (anyString){
            System.out.println("线程名称为：" + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "进入同步块");
            userNameParam = userName;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            passwordParam = password;
            System.out.println("线程名称为：" + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "离开同步块");
        }
    }
}
