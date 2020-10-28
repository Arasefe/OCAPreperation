package ocaCybertek.set4;

public class Question32 {
    public static String maskCC(String creditCard){
        String x="xxxx-xxxx-xxxx-";
        return x+creditCard.substring(15,19);
    }

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9112-1121"));
    }
}
