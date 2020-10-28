package ocaCybertek.set3;

public class _14Vowl {
    private char var;

    public static void main(String[] args) {
        char var1='a';
        char var2=var1;

        _14Vowl obj1= new _14Vowl();
        _14Vowl obj2= obj1;
        obj1.var='i';
        System.out.println(obj1.var);
        obj2.var='o';
        System.out.println(obj1.var);


//        System.out.println(var1+" "+var2);
//
//        System.out.println(obj1.var+" "+obj2.var);

    }
}
