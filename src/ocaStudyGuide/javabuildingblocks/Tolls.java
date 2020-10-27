package ocaStudyGuide.javabuildingblocks;

public class Tolls {
    private static int yesterday=1;
    int tomorrow=10;

    public static void main(String[] args) {
        Tolls tolls=new Tolls();
        int today=20;
        int tomorrow=40;
        System.out.println(today+tolls.tomorrow+tolls.yesterday);
    }
}
