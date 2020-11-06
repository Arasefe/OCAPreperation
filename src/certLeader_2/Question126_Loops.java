package certLeader_2;

public class Question126_Loops {
    public static void main(String[] args) {
        whileLoop();
        doWhileLoop();
        whileLoop2();

    }

    public static void whileLoop(){
        int array[]={10,20,30,40,50};
        int x=array.length;
        while(x>0){
            x--;
            System.out.println(array[x]);
        }
    }

    public static void doWhileLoop(){
        int array[]={10,20,30,40,50};
        int x=array.length;
        do{
            x--;
            System.out.println(array[x]);
        }while(x>=0);
    }

    public static void whileLoop2(){
        int array[]={10,20,30,40,50};
        int x=array.length;
        while(x>0){
            System.out.println(array[--x]);
        }
    }
}
