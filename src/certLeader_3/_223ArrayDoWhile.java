package certLeader_3;

public class _223ArrayDoWhile {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        int i=0;                           //0
        do{
            System.out.println(arr[i]+" "); //1 2   3   4
            i++;                            //0 1   2   3
        }while(i<arr.length+1);             //1 2   3   4
    }
}
