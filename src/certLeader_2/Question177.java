package certLeader_2;

class Question177_Bird {
    public void fly(){
        System.out.println("Fly");
    }
}
class Peacock extends Question177_Bird {
    public void dance() {
        System.out.println("Dance.");
    }

}
class Test{
    public static void main(String[] args) {
        Question177_Bird p=new Peacock();
        p.fly();
        Peacock b=new Peacock();
        b.dance();
    }


}

