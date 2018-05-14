package thread._1_basic._6_stop._1_inconsistency_code;

class SynchronizedObject {
    private String userName = "a";
    private String password = "aa";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    synchronized void printString(String userName,String password){
        try {
            this.userName = userName;
            Thread.sleep(1000);
            this.password = password;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
