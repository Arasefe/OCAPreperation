package ocaCybertek.set4;

public class Question19 {
    public static void main(String[] args) {
        try{
            int ans=10/0;
        }catch (ArithmeticException e){
            e.getStackTrace();
        }catch (RuntimeException re){
            System.out.println("Invalid calculation");
            re.printStackTrace();
        }
    }
}
