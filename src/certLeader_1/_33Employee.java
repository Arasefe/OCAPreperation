package certLeader_1;

public class _33Employee {
    String name;
    boolean contract;
    double salary;
    _33Employee(){
        this.name=new String("Joe");
        this.contract=new Boolean(true);
        this.salary=new Double(100);
    }
    public String toString(){
        return name+":"+contract+":"+salary;
    }

    public static void main(String[] args) {
        _33Employee e=new _33Employee();
//        e.name="Joe";
//        e.contract=true;
//        e.salary=100;
        System.out.println(e);
    }
}
