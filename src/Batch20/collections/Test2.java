package Batch20.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        methodSet();


    }
        public static void methodSet(){

            Set set1=new HashSet<>();
            set1.add(1);
            set1.add(3);
            set1.add(2);
            set1.add(5);
            set1.add(6);
            set1.add(9);
            set1.addAll(Arrays.asList(1,3,2,5,6,9));

            System.out.println(set1);

        }


}
