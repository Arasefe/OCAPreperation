package certLeader_2;

public class _119App {
    String greet="Welcome";

    public _119App(){
        String greet="Hello";
    }
    public void setGreet(){
        String greet="Good Day";
    }

    public static void main(String[] args) {
        _119App t=new _119App();
        String greet="Good Luck";
        System.out.println(t.greet);
        t.setGreet();
    }
}
