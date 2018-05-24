package thread._6_singleton._4_serializable;

import java.io.Serializable;

class MyObject implements Serializable {
    private static final long serialVersionUID = -1L;

    // 内部类方式
    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {
    }

    static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }


//    Object readResolve() throws ObjectStreamException {
//        System.out.println("调用了readResolve方法");
//        return MyObjectHandler.myObject;
//    }
}
