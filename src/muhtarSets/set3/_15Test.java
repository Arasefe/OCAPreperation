package muhtarSets.set3;

public class _15Test {
    static int count=0;
    int i=0;

    public void changeCount(){
        while(i<5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        _15Test check1= new _15Test();
        _15Test check2= new _15Test();
        check1.changeCount();
        check2.changeCount();

        System.out.println(check1.count+" "+check2.count);


    }
}
