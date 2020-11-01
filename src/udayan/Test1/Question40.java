package udayan.Test1;


public class Question40 {
    public int i1=1;
    protected int i2=2;
}

class B extends Question40{
    int i2=3;

    public void print() {
        Question40 obj = new Question40();
        System.out.println(obj.i1);     //Line 8
        System.out.println(obj.i2);     //Line 9
        System.out.println(this.i2);    //Line 10 No instance variable of i2
        System.out.println(super.i2);   //Line 11
    }

     static public void main(String[] args) {
        new B().print();
    }
}