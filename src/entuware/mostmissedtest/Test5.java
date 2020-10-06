package entuware.mostmissedtest;

public class Test5 {
    public static void main(String[] args) {
        String ta="A ";
        ta=ta.concat("B ");                         // A B
        String tb="C ";
        ta=ta.concat(tb);                           // A B C
        ta=ta.replace('C','D');     // A B D
        ta=ta.concat(tb);                           // A B D C
        System.out.println(ta);
    }
}
