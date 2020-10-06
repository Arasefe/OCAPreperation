package entuware.mostmissedtest;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        // red:blue:small:medium
        for (String[] each : shirts) {
            for (String s : each) {
                System.out.print(s + ":");
            }


            for (int index = 0; index < 2; index++) {
                for (int idx = 0; idx < 2; idx++) {
                    System.out.print(shirts[index][idx] + ":");

                }

            }
        }
    }
}
