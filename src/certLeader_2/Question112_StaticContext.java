package certLeader_2;

public class Question112_StaticContext {
    static int count;//int count;
    public static void display(){
        count++;
        System.out.println("Welcome Visit Count "+count);
    }

    public void listen(){
        count++;
        System.out.println("Welcome Visit Count "+count);
    }
    public static void main(String[] args) {
        Question112_StaticContext.display();
        Question112_StaticContext.display();

        Question112_StaticContext obj=new Question112_StaticContext();
        obj.listen();
    }
}
