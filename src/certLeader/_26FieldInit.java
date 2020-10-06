package certLeader;

public class _26FieldInit {
    Character c;                     // char c;gives nothing
    boolean b;
    float f;
    void printA11(){
        System.out.println("c ="+c);
        System.out.println("b ="+b);
        System.out.println("f ="+f);

    }

    public static void main(String[] args) {
        _26FieldInit f=new _26FieldInit();
        f.printA11();
    }
}
