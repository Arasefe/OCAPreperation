package certLeader;



public class _24NoArgConstructor {
    public _24NoArgConstructor(){
        System.out.println("A");
    }
    public _24NoArgConstructor(int a){
        System.out.println("1 Arg Constructor");
    }

}
class B extends _24NoArgConstructor{
    public B(){
        System.out.println("B");
    }
}
class C extends B{
    public C(){
        System.out.println("C");
    }

    public static void main(String[] args) {
        C c=new C();
    }
}
