package certLeader;

public class _64Test {
    public static void main(String[] args) {
        System.out.println("Hello "+new StringBuilder("Java SE 8"));
        System.out.println("Hello "+new MyString("Java SE 8"));
    }
}
class MyString{
    String msg;
    public MyString(String msg){
        this.msg=msg;
    }
}
