package certLeader_1;

public class _67TestCall {
    public static void main(String[] args) {
        Caller c=new Caller();
        c.start();
        c.init();
    }
}
class Caller{
    /*private*/ void init(){
        System.out.println("Initialized");
    }
    /*private*/ void start(){
        System.out.println("Started");
    }
}