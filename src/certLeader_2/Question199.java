package certLeader_2;

public class Question199 {
    public static void main(String[] args) {
        String stuff="TV";
        String res=null;

        if(stuff.equals("TV")){
            res="Walter";
        }else if(stuff.equals("Movie")){
            res="White";
        }else{
            res="No result";
        }
        System.out.println(res);
    }

}
