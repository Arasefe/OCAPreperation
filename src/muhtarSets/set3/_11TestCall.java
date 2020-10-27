package muhtarSets.set3;


public class _11TestCall {
    public static void main(String[] args) {
        Callager C=new Callager();
        C.start();
        C.init();
    }
}
class Callager{
    /*private*/ void init(){
        System.out.println("Initialized");
    }
    /*private*/  void start(){
        System.out.println("Started");
    }
}
