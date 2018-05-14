package thread._2_concurrency._1_synchronized_method_part._6_reentrant._1_reentrant;

class Service {
    synchronized void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized void service2(){
        System.out.println("service2");
        service3();
    }
    synchronized void service3(){
        System.out.println("service3");
    }
}
