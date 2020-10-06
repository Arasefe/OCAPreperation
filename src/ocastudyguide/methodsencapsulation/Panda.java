package ocastudyguide.methodsencapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Panda {
    int age;
    public static ArrayList<Panda>list;
    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 1;
        Panda p2 = new Panda();
        p2.age = 3;
        Panda p3 = new Panda();
        p3.age = 5;
        check(p1, p -> p.age < 5);

       list=new ArrayList<>(Arrays.asList(p1,p2,p3));
    }

    private static void check(Panda panda, Predicate<Panda> pred) {
            String result = pred.test(panda) ? "match" : "not match";
            System.out.println(result);
    }
}
