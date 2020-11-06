package certLeader_2;

public class Question153_FieldInit {
    Character   c;    //null              char c--> empty
    boolean b;
    float f;

    void printAll() {
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
    }

    public static void main(String[] args) {
        Question153_FieldInit f = new Question153_FieldInit();
        f.printAll();
    }
}
