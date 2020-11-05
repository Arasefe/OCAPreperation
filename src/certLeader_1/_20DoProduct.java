package certLeader_1;

public class _20DoProduct {
    int a1;
    public static void doProduct(int a){
        a=a*a;

    }
    public static void doString(String s){
        s.concat(" "+s);

    }

    public static void main(String[] args) {
        _20DoProduct item=new _20DoProduct();
        item.a1=11;
        String sb="Hello";
        Integer i=10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i+" "+sb+" "+ item.a1);
    }
}
