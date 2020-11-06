package certLeader_2;

public class Question119_App {
    String greet="Welcome";

    public Question119_App(){
        //String greet="Hello";
        this.greet="Hello";
    }
    public void setGreet(){
        String greet="Good Day";
    }

    public static void main(String[] args) {
        Question119_App t=new Question119_App();
        String greet="Good Luck";

        System.out.println(t.greet);

    }
}
