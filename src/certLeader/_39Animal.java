package certLeader;

public class _39Animal {
    String type="Canine";
    int maxSpeed=60;

    _39Animal(){}

    _39Animal(String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
}
class WildAnimal extends _39Animal{
    String bounds;
    WildAnimal(String bounds){
        super();
        this.bounds=bounds;
    }

    WildAnimal(String type, int maxSpeed){
        super(type,maxSpeed);
        this.bounds=bounds;
    }

    public static void main(String[] args) {
        WildAnimal wolf=new WildAnimal("Long");
        WildAnimal tiger=new WildAnimal("Feline",80);
        System.out.println(wolf.type+" "+wolf.maxSpeed+wolf.bounds);    // Canine 60 long
        System.out.println(tiger.type+" "+tiger.maxSpeed+tiger.bounds); // Feline 80 Short
    }
}
