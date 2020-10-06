package entuware;

public class Question9 {
    public static void main(String[] args) {
        int a=Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(a));
        int b=a*-1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(a+" "+b);
        System.out.println("++++++++++++++++++++++++");
        int c=4833;
        System.out.println(Integer.toBinaryString(c));
        int d=-c;
        System.out.println(Integer.toBinaryString(d));
        System.out.println(c);
        System.out.println(d);

    }
}
