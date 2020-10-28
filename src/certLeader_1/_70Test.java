package certLeader_1;

public class _70Test {
    public static void main(String[] args) {
        int x=10;       // 10
        int y=++x;      // Y=11 X=11
        int z=0;        // 0
        if(y>=10 | y<=++x){     //X=12
            z=x;        // 10
        }else{
            z=x++;
        }
        System.out.println(z);
    }
}
