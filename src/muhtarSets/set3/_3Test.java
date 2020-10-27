package muhtarSets.set3;

public class _3Test {
    int x, y;
    public _3Test(int x, int y){
        initialize(x,y);
    }
    public void initialize(int x, int y){
        this.x=x*x;
        this.y=y*y;
    }

    public static void main(String[] args) {
        int x=3,y=5;
        _3Test onj=new _3Test(x,y);
        System.out.println(x+" "+y);
    }
}
