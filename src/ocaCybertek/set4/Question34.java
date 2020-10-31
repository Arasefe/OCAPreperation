package ocaCybertek.set4;

public class Question34 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Aras");
        //sb.delete(0,sb.capacity());
        System.out.println("sb is "+sb);

        sb.delete(0,sb.length());
        System.out.println("sb is "+sb);
    }
}
