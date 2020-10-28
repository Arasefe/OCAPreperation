package ocaCybertek.set3;

public class _4Employee {
    String name;
    boolean contract;
    double salary;
    public _4Employee(){
    //ln1
//     this.name="joe";
//     this.contract=true;
//     this.salary=100;
//        this.name=new String("Joe");
//        this.contract=new Boolean(true);
//        this.salary=new Double(100);
    }

    public String toString(){
        return name+" : "+contract+" : "+salary;
    }

    public static void main(String[] args) {
        _4Employee e=new _4Employee();
        //ln2
        e.name="joe";
        e.contract=true;
        e.salary=100;
        System.out.println(e);      //joe true 100.0
    }
}
