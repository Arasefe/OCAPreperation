package muhtarSets.set1;

public class Question33 {
    public static void main(String[] args) {
        String str1="Java";
        String str2[]={"J","a","v","a"};
        String str3="";
        for (int i = 0; i < str2.length; i++) {
            str3=str3+str2[i];
        }
        System.out.println(str3);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }
}
