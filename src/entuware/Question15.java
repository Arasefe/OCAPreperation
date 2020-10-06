package entuware;

public class Question15 {
    public static void main(String[] args) {
        boolean b=false;
        switch(Integer.parseInt(args[1])){
            case 0:
                b=false;
                break;
            case 1:
                b=true;
                break;
        }
        if(b) System.out.println(args[2]);
    }
}
