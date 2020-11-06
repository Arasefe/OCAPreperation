package certLeader_3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question222_Iterator {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("AR","BN","TL","SM");
        Iterator<String>itr=list.iterator();
        while(itr.hasNext()){
            String e=itr.next();
            if(e=="SM"){
                break;
            }
            System.out.println(e+" ");
        }

    }
}
