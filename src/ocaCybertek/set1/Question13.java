package ocaCybertek.set1;

public class Question13 {
    public static void main(String[] args) {
        String[][]arr={{"A","B","C"},{"D","E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].equalsIgnoreCase("B")){
                    break;
                }
                System.out.println(arr[i][j]);
            }
        }
    }
}
