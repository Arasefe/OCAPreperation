package Batch20.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(methodAnagram("aaabbb","bbbaaa"));
    }

    public static boolean methodAnagram(String str1, String str2){
        String []str1Arr=str1.split("");
        String []str2Arr=str2.split("");

        Set<String>set1=new HashSet<>();
        Set<String>set2=new HashSet<>();

        set1.addAll(Arrays.asList(str1Arr));

        set2.addAll(Arrays.asList(str2Arr));

        return set1.equals(set2);

    }
}
