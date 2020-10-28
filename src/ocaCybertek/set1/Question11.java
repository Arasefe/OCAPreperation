package ocaCybertek.set1;

public class Question11 {
    public static void main(String[] args) {
        String[][]arr={{"A","B","C"},{"D","E"}};
        for (int i = 0; i < arr.length; i++) {          // 2
            for (int j = 0; j < arr[i].length; j++) {   // 3 2
                System.out.print(arr[i][j]);
                if (arr[i][j].equals("B")) {
                    break;
                }
            }
        }

    }
}
