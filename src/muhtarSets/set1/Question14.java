package muhtarSets.set1;

public class Question14 {
    public static void main(String[] args) {
        arrayAssignment1();
        arrayAssignment2();
    }
    public static void arrayAssignment1(){
        int[]num1=new int[3];
        int[]num2={1,2,3,4,5};
        num1=num2;

        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]);
        }
        System.out.println();
    }
    public static void arrayAssignment2(){
        int[]num1=new int[0];
        int[]num2={1,2,3,4,5};
        num1=num2;

        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]);
        }
    }
}
