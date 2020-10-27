package certLeader;

public class _83Test {
    public static void main(String[] args) {
        _83Test ts=new _83Test();
        System.out.println(isAvailable+" ");
        isAvailable=ts.doStuff();
        System.out.println();
        System.out.println(isAvailable);
    }
    public static boolean doStuff(){
        return !isAvailable;
    }
    static boolean isAvailable=true;
}
