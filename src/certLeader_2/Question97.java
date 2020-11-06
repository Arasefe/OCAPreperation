package certLeader_2;

public class Question97 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        String s="Java";

        if(sb.toString().equals(s)){
            System.out.println("Match_1");
        }else if(sb.equals(s)){
            System.out.println("Match_2");
        }else{
            System.out.println("No match");
        }


    }
}
