package certLeader_1.person;

public class Person {
    String name;
    int age=25;

    Person(String name){
        setName(name);
    }
    public Person(String name,int age){
        this(name);         //Person(name);
        setAge(age);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String show(){
        return name+" "+age;
    }

    public static void main(String[] args) {
        Person p1=new Person("Jesse");
        Person p2=new Person("Walter",54);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}
