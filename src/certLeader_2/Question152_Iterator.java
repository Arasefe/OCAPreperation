package certLeader_2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question152_Iterator {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("A", "B", "C", "D");
        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            String e = itr.next();
            if (e == "C") {
                break;
            } else {
                 System.out.print(e);
                continue;
                 //System.out.println(e);
            }
        }
    }
}
