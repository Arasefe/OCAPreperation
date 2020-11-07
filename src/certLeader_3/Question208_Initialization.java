package certLeader_3;

public class Question208_Initialization {
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
        Question208_Initialization c=new Question208_Initialization();
        //c.start(); //compilation fails
        //c.init();  //compilation fails
    }
}
