package muhtarSets.set2;

import java.util.Arrays;

public class Question37 {
    public static void main(String[] args) {
        String[]strs=new String[3];
        int idx=0;
        for (String s : strs) {
            strs[idx]=strs[idx].concat(" element "+idx);
            idx++;
        }
        System.out.println(Arrays.toString(strs));
    }
}
