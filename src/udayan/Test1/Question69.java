package udayan.Test1;

public class Question69 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = sb.toString();
        System.out.println(s1 == s2);
        A obj=new A();
        System.out.println(obj.a);
    }
    static class A {
        int a=12;
        int b=23;
        char c='c';
        public static void main(String[] args) {
            System.out.println();
        }

    }
}

