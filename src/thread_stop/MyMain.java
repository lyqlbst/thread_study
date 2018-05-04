package thread_stop;

class MyMain {

    public static void main(String[] args) {
        MyThreadCannotStop thread = new MyThreadCannotStop();
        thread.start();
        thread.interrupt();
    }
}
