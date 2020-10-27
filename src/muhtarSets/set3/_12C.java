package muhtarSets.set3;


class A1{
    public A1(){
        System.out.println("A");
    }
}



class B extends A1 {
    public B(){
        System.out.println("B");
    }
}


public class _12C extends B {
    public _12C(){
        System.out.println("C");
    }
    public static void main(String[] args) {
//        _12C obj1=new _12C();
//        B obj2=new B();
        A1 obj3=new A1();

    }
}
