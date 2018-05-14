package thread._2_concurrency._2_synchronized_code_blocks_part.any_object_as_monitor.demo2;

class Service {
    private String userNameParam;
    private String passwordParam;

    void setUserNamePassword(String userName, String password) {
        String anyString = new String();
        synchronized (anyString){
            System.out.println("线程名称为：" + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "进入同步块");
            userNameParam = userName;
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            passwordParam = password;
            System.out.println("线程名称为：" + Thread.currentThread().getName()
                    + "在" + System.currentTimeMillis() + "离开同步块");
        }
    }
}
