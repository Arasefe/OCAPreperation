package certLeader_1;

public class _86Casting extends ACaster {
    public void test(){
        System.out.println("C ");
    }

    public static void main(String[] args) {
        ACaster b1=new ACaster();
        ACaster b2=new _86Casting();
        ACaster b3=(BCaster)b2;     // line n1
        b1=(ACaster)b2;
        b1.test();
        b3.test();
    }
}
class BCaster extends ACaster{
    public void test(){
        System.out.println("B ");
    }
}
class ACaster{
    public void test(){
        System.out.println("A ");
    }
}