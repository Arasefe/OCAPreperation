package ocpStudyGuide.unit3;

import java.util.HashSet;
import java.util.Set;

public class Q24 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("lion");
        s.add("tiger");
        s.add("bear");
        s.add("bear");
        s.add("bear");
        s.add("bear");
        s.add("bear");

        s.forEach(System.out::println);

        s.remove("lion");
        System.out.println(s);
    }
}
