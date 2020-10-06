package ocastudyguide.javabuildingblocks;

public class WrapperConversion {
    public static void main(String[] args) {
        Integer integer=new Integer(8);
        System.out.println(integer.byteValue());
        System.out.println("-");

        int i=new Integer(4);
        //System.out.println(i.byteValue());

        int a=2;
        a=new Integer(2);
    }
}
