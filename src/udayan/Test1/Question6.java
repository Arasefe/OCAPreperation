package udayan.Test1;

public class Question6 {
    private static void m(int x){
        System.out.println("int version");
    }

    private static void m(char x){
        System.out.println("char version");
    }





    public static void main(String[] args) {
        int i='5';
        m(i);
        m('5');
    }
}
