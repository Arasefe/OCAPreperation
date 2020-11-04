package certLeader_3;

public class _208Initialization {
    private void init(){
        System.out.println("Initialized");
    }

    private void start(){
        init();
        System.out.println("started");
    }
}
class TestCaller{
    public static void main(String[] args) {
        _208Initialization c=new _208Initialization();
        //c.start(); compilation fails
        //c.init();  compilation fails
    }
}
