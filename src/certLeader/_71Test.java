package certLeader;

public class _71Test {
    public static void main(String[] args) {
        CC2 obj1=new CC1();
        II obj2=new CC1();

//        CC2 s=obj2;
//        II t=obj1;
//        t.displayI();
//        s.displayC2();
    }
}
class CC2{
    public void displayC2(){
        System.out.println("c2");
    }
}
interface II{
    public void display();
}
class CC1 extends CC2 implements II{
    public void display(){
        System.out.println("c1");
    }
}