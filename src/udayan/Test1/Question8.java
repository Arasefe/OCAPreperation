package udayan.Test1;

public class Question8 {
    public static void main(String[] args) {
        String[]arr={"I","N","S","E","R","T"};
        for (int n = 1; n <= arr.length; n+=2) {
            if(n%2==0){
                continue;
            }

            System.out.print(arr[n]);
        }
    }
}
