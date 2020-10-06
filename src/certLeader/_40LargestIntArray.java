package certLeader;

public class _40LargestIntArray {
    public static void main(String[] args) {
        largestElementInArray(new int[]{1,3,4,65,78,9});
    }
    public static void largestElementInArray(int[]arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
