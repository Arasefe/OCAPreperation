package certLeader_2;
import certLeader_1._100Acc;

public class _100Test extends _100Acc {
    public static void main(String[] args) {
        _100Test obj=new _100Test();
        System.out.println("obj.r3 = " + obj.r3);
        System.out.println("obj.s = " + obj.s);

        _100Acc obj1=new _100Acc();
        //System.out.println("obj.r3 = " + obj1.r3);
        System.out.println("obj.s = " + obj1.s);

        _100Acc obj2=new _100Test();
        //System.out.println("obj.r3 = " + obj2.r3);
        System.out.println("obj.s = " + obj2.s);
    }

}
