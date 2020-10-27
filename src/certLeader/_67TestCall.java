package certLeader;

public class _67TestCall {
    public static void main(String[] args) {
        Caller c=new Caller();
        c.start();
        c.init();
    }
}
class Caller{
     void init(){
        System.out.println("Initialized");
    }
     void start(){
        System.out.println("Started");
    }
}