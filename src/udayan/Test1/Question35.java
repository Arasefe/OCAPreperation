package udayan.Test1;

public class Question35 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
    public static void m1() throws Exception{
        System.out.println("Not throwing any exception");
    }
}
