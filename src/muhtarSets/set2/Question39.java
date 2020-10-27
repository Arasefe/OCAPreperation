package muhtarSets.set2;

public class Question39 {
    public static void main(String[] args) {
        System.out.println(new String("Java SE 8"));
        System.out.println(new MyString("Java SE 8"));
    }

}
class MyString{
    String msg;
    public MyString(String str){
        msg=str;
    }
}