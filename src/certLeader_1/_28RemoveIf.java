package certLeader_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _28RemoveIf {
    public static void main(String[] args) {
        String [] arr={"Hi","How","Are","You"};
        List<String> arrayList=new ArrayList<>(Arrays.asList(arr));
        if(arrayList.removeIf(s->{ System.out.print(s);return s.length()<=2;})){
            System.out.println(" removed");
        }
    }
}
