package certLeader_2;

import java.util.ArrayList;
import java.util.List;

public class _136ListPractice {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Tech");
        list.add("Expert");
        list.set(0,"Java");
        list.forEach(s->s.concat("Forum"));
        list.replaceAll(d->d.concat("Group"));
        System.out.println(list);
    }
}
