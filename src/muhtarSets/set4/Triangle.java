package muhtarSets.set4;

public class Triangle {
    static double area;
    int b=2,h=3;

    public static void main(String[] args) {
        double p=1,b=1,h=1;

        if(area==0){
            b=3;
            h=4;
            p=0.5;
        }
        area=p*b*h;
        System.out.println("Area is "+area);
    }

}
