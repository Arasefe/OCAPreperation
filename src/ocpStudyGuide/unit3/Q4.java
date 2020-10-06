package ocpStudyGuide.unit3;

import java.util.ArrayDeque;

public class Q4 {
    public static void main(String[] args) {
        ArrayDeque<String>greetings=new ArrayDeque<>(); //LIFO
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
//        greetings.push("selam");
//        greetings.push("priviet");
        greetings.pop();
        greetings.peek();
        while(greetings.peek()!=null){
            System.out.print(greetings.pop());
        }


    }



}
