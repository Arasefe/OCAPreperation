package ocpStudyGuide.unit3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q21 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "3");
        Iterator iter = list.iterator();
        while (iter.hasNext())
            System.out.print(iter.next());
    }
}
