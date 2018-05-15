package thread._2_concurrency._3_volatile_part._1_dead_cycle;

/**
 * 关键字volatile的主要作用是使变量在多个线程间可见。
 *
 * 如果不是在多继承的情况下，使用集成Thread类和实现Runnable接口在取得程序运行的结果上并没有什么太大的区别。
 * 如果一旦出现“多继承”的情况，则用实现Runnable接口的方式来处理多线程的问题就很有必要了。
 *
 * 程序开始运行后，根本停不下来。
 * 停不下来的原因主要是main线程一直在处理while循环，导致程序不能继续执行后面的代码。
 */
class MyMain {

    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("我要停止它！stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
