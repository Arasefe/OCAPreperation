package muhtarSets.set3;




public class _23C1 extends C2 implements  InF{
    public static void main(String[] args) {
        C2 obj1=new _23C1();
        InF obj2=new _23C1();

//        C2 S=  obj2;
//        InF t=obj1;
    }

    @Override
    public void displayI() {

    }
}
interface InF{
    public void displayI();
}

class C2{
    public void displayC2(){
        System.out.println("C2");
    }
}