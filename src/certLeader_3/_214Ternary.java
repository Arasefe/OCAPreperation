package certLeader_3;

public class _214Ternary {
    public static final int MIN=1;

    public static void main(String[] args) {
        int x=args.length;      // 1
        if(checkLimit(x)){
            System.out.println("JAVA SE");
        }else{
            System.out.println("JAVA EE");
        }
    }
    public static boolean checkLimit(int x){
        return (x>=MIN)?true:false;
    }
}
