package entuware;

public class Question5 {
    public static void main(String[] args) {
        Base b=new Base();
        System.out.println(b.getValue());
    }
}
class Base2 extends Base{
    public short getValue(){    // Method overriding return type must be same or covariant
        return 2;
    }
}
class Base{
    public short getValue(){
        return 1;
    }
}
