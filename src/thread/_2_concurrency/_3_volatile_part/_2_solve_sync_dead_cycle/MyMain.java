package thread._2_concurrency._3_volatile_part._2_solve_sync_dead_cycle;

/**
 * 结果是程序被停止了。
 * 但当示例代码的格式（记住，是“格式”，不是“代码”），一旦运行在-server服务器模式中64bit的JVM上时，
 * 会出现死循环。解决的办法是使用volatile关键字。
 * 关键字volatile的作用是强制从公共堆栈中取得变量的值，而不是从线程私有数据栈中取得变量的值。
 */
class MyMain {

    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止它！stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
