package ocastudyguide.methodsencapsulation;

public class RopeSwing {
    private static Roper roper1=new Roper();
    private static Roper roper2=new Roper();
    {
        System.out.println(roper1.length);
    }

    public static void main(String[] args) {
        roper1.length=2;
        roper2.length=8;
        System.out.println(roper1.length);
    }
}
class Roper{
    public static int length=0;
}
