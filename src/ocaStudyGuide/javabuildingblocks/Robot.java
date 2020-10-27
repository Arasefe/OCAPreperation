package ocaStudyGuide.javabuildingblocks;

public class Robot {
    static String weight="A lot";
    double ageMonths=5;
    double ageDays=2;

    private static boolean success=true;

    public  void main(String[] args) {
        final String retries="1";
        System.out.println(weight);
        System.out.println(ageMonths+ageDays);
        System.out.println(success);
        System.out.println(retries);

    }
}
