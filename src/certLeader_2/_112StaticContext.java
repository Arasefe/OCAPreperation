package certLeader_2;

public class _112StaticContext {
    static int count;
    public static void display(){
        count++;
        System.out.println("Welcome Visit Count "+count);
    }

    public void listen(){
        count++;
        System.out.println("Welcome Visit Count "+count);
    }
    public static void main(String[] args) {
        _112StaticContext.display();
        _112StaticContext.display();

        _112StaticContext obj=new _112StaticContext();
        obj.listen();
    }
}
