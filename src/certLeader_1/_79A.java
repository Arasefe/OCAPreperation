package certLeader_1;

class CC {
    public CC(){
        System.out.println("C ");
    }
}


class BB extends C{
    public BB(){
        System.out.println("B ");
    }
}

public class _79A extends B{
    public _79A(){
        System.out.println("A ");
    }

    public static void main(String[] args) {
        _79A a=new _79A();
    }
}
