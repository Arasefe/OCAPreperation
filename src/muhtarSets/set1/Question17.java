package muhtarSets.set1;

public class Question17 {
    public static void main(String[] args) {
        int x=100;
        int a=x++;
        int b=++x;
        int c=x++;
        int d=(a<b)?(a<c)?a:(b<c)?b:c:0;
    }
}
