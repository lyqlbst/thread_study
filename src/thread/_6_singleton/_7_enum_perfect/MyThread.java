package thread._6_singleton._7_enum_perfect;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) System.out.println(MyObject.getConnection().hashCode());
    }
}
