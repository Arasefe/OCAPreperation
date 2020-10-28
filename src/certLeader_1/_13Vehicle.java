package certLeader_1;

public class _13Vehicle {
    int x;
    _13Vehicle(){
        this(10);
    }
    _13Vehicle(int x){
        this.x=x;
    }
}
class Car extends _13Vehicle{
    int y;
    Car(){
        super(10);
    }
    Car(int y){
        super(y);
        this.y=y;
    }
    public String toString(){
        return super.x+" : "+this.y;
    }

    public static void main(String[] args) {
        _13Vehicle y=new Car(20);
        System.out.println(y);
    }

}

