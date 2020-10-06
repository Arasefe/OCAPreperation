package entuware;


public class Question24 {
    public static void main(String[] args) {

        short s = 9;
        Short k = new Short(s);
        System.out.println(k instanceof Short);
        //System.out.println(s instanceof Short);
        //short k=9;
        //System.out.println(k instanceof s);
        int i=9;
        System.out.println(s==i);
        //Boolean b=s instanceof Number;
        //Short k=9;Integer i=9;
        System.out.println(k==i);

    }
}
