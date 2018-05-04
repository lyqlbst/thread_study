package thread.basic.currentThread.example2;

class MyMain {

    public static void main(String[] args) {
        CountOpearte countOpearte = new CountOpearte();
        Thread thread = new Thread(countOpearte);
        thread.setName("A");
        thread.start();
    }
}
