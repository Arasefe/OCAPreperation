package entuware.WorkingWithMethods;

import java.util.Arrays;
import java.util.Collections;

public class Stack {
    public static void main(String[] args) {
        Stack s1=new Stack();
        Stack s2=new Stack();
        processStacks(s1,s2);
        System.out.println(s1+" "+s2);

    }
    public static void processStacks(Stack x1, Stack x2){
        x1.push(new Integer("100"));
        x2=x1;
    }
    public static int push(int a){
        int[]stack=new int[2];
        stack[0]=a;
        return stack[0];
    }
}
