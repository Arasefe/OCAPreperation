package ocastudyguide.javabuildingblocks;

public class Airplane {
    static int start=2;
    final int end;
    public Airplane(int x){
        x=4;
        end=x;
    }
    ////// Valid comment
    public void fly(int distance){
        System.out.println(end-start+"");
        System.out.println(distance);
    }

    public static void main(String[] args) {
        new Airplane(10).fly(5);
    }
}
