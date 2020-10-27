package ocaStudyGuide.javabuildingblocks;

public class ParkRanger {
    static int birds=10;
    double puppies=3;
    public static void main(String[] args) {
        int trees=5;
        System.out.println(trees+birds);
        //System.out.println(puppies); DOES NOT COMPILE AS STATIC CONTEXT CAN NOT CALL NONSTATIC

    }
}
