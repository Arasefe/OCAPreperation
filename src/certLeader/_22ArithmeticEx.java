package certLeader;

public class _22ArithmeticEx {
    public static void main(String[] args) {
        int a;
        try{
            int num=10;
            int div=0;
            a=num/div;
        }catch (ArithmeticException e){
            a=0;                                // line1
        }catch (Exception e){
            System.out.println("Invalid calculation");
        }
        //System.out.println("Answer "+a);        // line2
    }
}
