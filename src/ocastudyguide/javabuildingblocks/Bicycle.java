package ocastudyguide.javabuildingblocks;

public class Bicycle {
    String color="red";
    private void printColor(String color){
        color="purple";
        System.out.println(color);
    }

    public static void main(String[] args) {
        new Bicycle().printColor("blue");
    }
}
