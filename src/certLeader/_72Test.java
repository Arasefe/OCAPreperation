package certLeader;

public class _72Test {
    public static void main(String[] args) {
        _72Test ts=new _72Test();
        System.out.print(isAvailable+" ");
        isAvailable=ts.doStuff();
        System.out.println(isAvailable);
    }
    public boolean doStuff(){
        return !isAvailable;
    }
    static boolean isAvailable=false;
}
