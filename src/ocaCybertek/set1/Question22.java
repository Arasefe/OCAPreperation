package ocaCybertek.set1;

import java.util.Arrays;

public class Question22 {
    public static void main(String[] args) {
        int numbers[];
        numbers=new int[4];
        numbers[0]=10;
        numbers[1]=20;
        //numbers=new int[4];
        numbers[2]=30;
        numbers[3]=40;
        System.out.println(Arrays.toString(numbers));
        arrayMethod2();
    }


    public static void arrayMethod(){
        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        System.out.println(Arrays.toString(numbers));
    }

    public static void arrayMethod2(){
        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;
        numbers=new int[4];
        numbers[2]=3;
        numbers[3]=4;
        System.out.println(Arrays.toString(numbers));
    }
}
