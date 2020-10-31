package ocaCybertek.set4;

public class Question32 {
    public static String maskCC1(String creditCard){
        String x="xxxx-xxxx-xxxx-";
        return x+creditCard.substring(15,19);
    }

    public static String maskCC2(String creditCard){
        String x="xxxx-xxxx-xxxx-";
        StringBuilder sb=new StringBuilder(x);
        sb.append(creditCard,15,19);
        return sb.toString();
    }



    public static void main(String[] args) {
        System.out.println(maskCC1("1234-5678-9112-1121"));
        System.out.println(maskCC2("1234-5678-9112-1121"));
    }
}
