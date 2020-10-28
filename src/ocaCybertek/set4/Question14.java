package ocaCybertek.set4;

public class Question14 {
    public static void main(String[] args) {
        System.out.println("hello"+new StringBuilder("Java SE 8"));
        System.out.println("hello"+new MyString("Java SE 8"));
    }
}
class MyString{
    String msg;
    MyString(String msg){
        this.msg=msg;
    }
}