package entuware;

public class Question18 {
    public static void main(String[] args) {
        Movable m=new Donkey();
        m.move(10);
        m.moveBack(20);
        System.out.println(m.location);
    }
}
interface Movable{
    int location=0;
    void move(int by);                      // abstract method
    public void moveBack(int by);           // abstract method
}

class Donkey implements Movable{            // Donkey class has to implement all abstract methods
    int location=200;
    public void move(int by){
        location=location+by;
    }
    public void moveBack(int by){
        location=location-by;
    }
}
