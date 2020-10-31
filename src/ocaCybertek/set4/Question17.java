package ocaCybertek.set4;

public class Question17 {
    static double area;                 //0.0
    int b=2,h=3;

    public static void main(String[] args) {
        double p=1;
        double b=1;
        double h=1;
        if(area==0) {                   // 0.0==0
            b=3;
            h=4;
            p=0.5;
        }
        area=p*b*h;
        System.out.println("Area is = " + area);
    }
}
