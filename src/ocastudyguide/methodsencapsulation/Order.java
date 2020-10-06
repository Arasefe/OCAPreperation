package ocastudyguide.methodsencapsulation;

public class Order {
    static String result="";
    {
        result+="c";
    }
    static{
        result+="u";
    }
    {
        result+="r";
    }
}
class OrderDriver{
    public static void main(String[] args) {
        System.out.println(Order.result+"");    // u
        System.out.println(Order.result+"");    // u
        new Order();                            // Constructor is instantiated
        new Order();                            // Constructor is instantiated
        System.out.println(Order.result+"");    //
    }
}
