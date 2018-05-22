package thread._3_communication._3_threadLocal._3_solve_null;

class ThreadLcoalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再为null";
    }
}
