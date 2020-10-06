package entuware;

public class Question2 {
    static double percent;
    int offset=10;
    int base=50;
    public static double calc(double value){
        int coupon,offset,base;
        if(percent<10){
            coupon=15;
            offset=20;
            base=10;
        }
       // return coupon*offset*base*value/100;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(calc(100));
    }
}
