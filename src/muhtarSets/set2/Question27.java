package muhtarSets.set2;

public class Question27 {
    public static void main(String[] args) {
        Boolean [] bool=new Boolean[2];
        bool[0]=Boolean.valueOf(Boolean.parseBoolean("true"));  // true
        bool[1]=Boolean.valueOf(null);          // false
        System.out.println(bool[0]+" "+bool[1]);
    }
}
