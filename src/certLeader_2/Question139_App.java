package certLeader_2;

public class Question139_App {
    static int count;
    public static void displayMsg(){
        System.out.println("Welcome Visit Count"+ count++);
    }

    public static void main(String[] args) {
        Question139_App.displayMsg();
        displayMsg();
    }
}
