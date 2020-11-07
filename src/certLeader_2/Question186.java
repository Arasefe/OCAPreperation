package certLeader_2;

public class Question186 extends S1 {
    public void display(int x, int y){
        this.display(x);
        display(y);
        super.display(y);
    }
    public void display(int x){
        System.out.println("Child "+x);
    }

    public static void main(String[] args) {
        Question186 sobj=new Question186();
        sobj.display(10,100);
    }

}
class S1 {
    protected void display(int x){
        System.out.println("Parent "+x);
    }
}