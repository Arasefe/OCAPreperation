package certLeader;

public class _42StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ABCCDCDED");
        sb.delete(0,sb.length());
        System.out.println(sb);
    }
}
