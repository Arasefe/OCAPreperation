package certLeader_1;

public class _44Game {

    public static void menu(){
        System.out.println("1. Left 2. Right 0.Stop");
    }


    public static void main(String[] args) {
        int option;
        for (option = 0; option <3 ; option++) {
            menu();
            System.out.println(option);
        }
    }
}
