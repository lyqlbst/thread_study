package thread.basic.currentThread.better_understanding;

class MyMain {

    public static void main(String[] args) {
        CountOpearte countOpearte = new CountOpearte();
        Thread thread = new Thread(countOpearte);
        thread.setName("A");
        thread.start();
    }
}
