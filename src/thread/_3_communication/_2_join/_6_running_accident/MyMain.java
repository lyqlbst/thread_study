package thread._3_communication._2_join._6_running_accident;

/**
 * 针对前面章节中的代码进行测试的过程中，还可以延伸出“陷阱式”的结果，如果稍加不注意，就会掉进“陷阱”里。
 * 程序运行后，在控制台打印的效果是：有时候“main end ……”提前打印了。
 */
class MyMain {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        try {
            b.join(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end " + System.currentTimeMillis());
    }
}
