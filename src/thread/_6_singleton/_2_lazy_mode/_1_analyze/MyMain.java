package thread._6_singleton._2_lazy_mode._1_analyze;

/**
 * 延迟加载/“懒汉模式”是在调用方法时实例才被创建。
 * 程序运行结果：“懒汉模式”成功取出一个实例
 * 此实验虽然取得一个对象的实例，但如果在多线程环境中，就会出现取出多个实例的情况，与单例模式的初衷是相背离的。
 */
class MyMain {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
