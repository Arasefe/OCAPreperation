package certLeader_2;

public class _177Bird {
    public void fly(){
        System.out.println("Fly");
    }
}
class Peacock extends _177Bird {
    public void dance() {
        System.out.println("Dance.");
    }

}
class Test{
    _177Bird b=new _177Bird();
    Peacock p= new Peacock();


}

