package entuware;

public class Question12 {
    public static void main(String[] args) {

        String mStr = "123";
        long a = Long.parseLong(mStr);
        long b = Long.valueOf(mStr);
        long c = Long.valueOf(mStr).longValue();
        //long t=(new Long()).parseLong(mStr); DOES NOT COMPILE
        long d = new Long(mStr);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);






    }
}
