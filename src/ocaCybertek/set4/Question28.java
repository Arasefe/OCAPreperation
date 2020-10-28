package ocaCybertek.set4;

public class Question28 {
    String myStr = "7007";

    public void doStuff(String str) {             //"9009"
        int myNum = 0;
        try {
            String myStr = str;                   //"9009"

            myNum = Integer.parseInt(myStr);      // 9009
        } catch (NumberFormatException nfe) {
            System.err.println("Error");
        }
        System.err.println("myStr: " + myStr + ",myNum: " + myNum);
    }

    public static void main(String[] args) {
        Question28 obj = new Question28();
        obj.doStuff("9009");
    }
}
