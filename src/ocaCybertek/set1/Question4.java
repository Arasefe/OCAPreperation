package ocaCybertek.set1;

public class Question4 {
    public static void main(String[] args) {
        int ivar=100;
        double dvar=123;
        float fvar=200;
        //ivar=fvar; compile time error
        fvar=ivar;
        dvar=fvar;
        //fvar=dvar; compile time error
        dvar=ivar;
        //ivar=dvar; compile time error
    }

}
