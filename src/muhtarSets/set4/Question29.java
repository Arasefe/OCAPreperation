package muhtarSets.set4;

public class Question29 {
    int a1;
    public static void doProduct(int a){
        a=a*a;
    }

    public static void doString(StringBuilder s){
        s.append(" "+s);
    }

    public static void main(String[] args) {
        Question29 item=new Question29();
        item.a1=10;
        StringBuilder sb=new StringBuilder("Hello");
        Integer i=10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);

        System.out.println(i+" "+sb+" "+item.a1);
    }
}
