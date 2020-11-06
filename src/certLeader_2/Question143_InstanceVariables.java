package certLeader_2;

public class Question143_InstanceVariables {
    char c;
    boolean b;
    float f;

    void printAll(){
        System.out.println("c = "+c);
        System.out.println("b = "+b);
        System.out.println("f = "+f);
    }

    public static void main(String[] args) {
        Question143_InstanceVariables obj=new Question143_InstanceVariables();
        obj.printAll();
    }
}
