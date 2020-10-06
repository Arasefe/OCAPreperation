package entuware.WorkingWithMethods;

public class Triangle {
    public int base;
    public int height;
    private static double ANGLE;
    public static double getANGLE(){
        return ANGLE;
    }

    public static void Main(String[] args) {
        System.out.println(getANGLE());
    }
}
