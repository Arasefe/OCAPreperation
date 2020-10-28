package certLeader_1;

public class _8TwoDArray {
    public static void main(String[] args) {
        String[][]array={{"a","b","c"},{"d","e"}};
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]+" ");
                if(array[i][j].equals("b")){
                    continue;
                }
            }
            continue;
        }
    }
}
