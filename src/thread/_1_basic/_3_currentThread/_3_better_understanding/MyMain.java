package thread._1_basic._3_currentThread._3_better_understanding;

class MyMain {

    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        thread.setName("A");
        thread.start();
    }
}
