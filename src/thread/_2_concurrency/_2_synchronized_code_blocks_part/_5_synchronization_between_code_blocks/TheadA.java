package thread._2_concurrency._2_synchronized_code_blocks_part.synchronization_between_code_blocks;

class TheadA extends Thread{
    private ObjectService service;
    TheadA(ObjectService service){
        super();
        this.service = service;
    }
    @Override
    public void run(){
        super.run();
        service.serviceMethodA();
    }
}
