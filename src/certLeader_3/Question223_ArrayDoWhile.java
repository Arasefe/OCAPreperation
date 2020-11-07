package certLeader_3;

public class Question223_ArrayDoWhile {
    public static void main(String[] args) {
        exceptionHandling();
        int[] arr = {1, 2, 3, 4};
        int i = 0;                           //0
        do {
            System.out.print(arr[i] + " "); //1 2   3   4   ArrayIndexOutOfBoundsException
            i++;                            //0 1   2   3
        } while (i < arr.length + 1);             //1 2   3   4
    }

    public static void exceptionHandling() {
        int[] arr = {1, 2, 3, 4};
        int i = 0;                           //0
        do {

            System.out.print(arr[i] + " "); //1 2   3   4   ArrayIndexOutOfBoundsException
            i++;                            //0 1   2   3
        } while (i < arr.length + 1);             //1 2   3   4

    }
}
