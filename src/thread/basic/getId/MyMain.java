package thread.basic.getId;

/**
 * getId()方法的作用是取得线程的唯一标识
 */
class MyMain {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
    }
}
