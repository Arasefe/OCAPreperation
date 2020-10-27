package ocaStudyGuide.javabuildingblocks;

public class InstanceVsStatic {
    int a=3;
    static double b=3.5;
    public static void method1(){
        System.out.println(b);
    }

    public void method2(){
        System.out.println(a+b);
    }
}
