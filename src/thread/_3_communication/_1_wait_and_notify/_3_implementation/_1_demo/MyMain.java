package thread._3_communication._1_wait_and_notify._3_implementation._1_demo;


/**
 * 出现异常的原因是没有“对象监视器”，也就是没有同步加锁。
 */
class MyMain {

    public static void main(String[] args) {
        String newString = new String();
        try {
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
