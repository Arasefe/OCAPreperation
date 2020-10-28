package certLeader_1.animal;


import java.util.ArrayList;

public abstract class Animal {

}
interface Hunter{

}
class Cat extends Animal implements Hunter{

}

class Tiger extends Cat {
    public static void main(String[] args) {
        ArrayList<Animal>list1=new ArrayList<>();
        list1.add(new Tiger());
        ArrayList<Hunter>list2=new ArrayList<>();
        list2.add(new Cat());
        ArrayList<Hunter>list3=new ArrayList<>();
        list3.add(new Tiger());
        ArrayList<Tiger>list4=new ArrayList<>();
        //list4.add(new Cat());
        ArrayList<Animal>list5=new ArrayList<>();
        list5.add(new Cat());

    }
}