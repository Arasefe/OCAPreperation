package certLeader_3;

public class _202Employee {
    public int salary;
}

class Manager extends _202Employee{
    public int budget;
}
class Director extends Manager{
    public int stockOptions;
}

    class Tek{
        public static void main(String[] args) {
            _202Employee e=new _202Employee();
            _202Employee m=new Manager();
            _202Employee d=new Director();

            e.salary=50000;     // reference type decides which methods ad variables are accessible

            d.salary=55000;     // Object type decides which properties exist within the object memory
        }
    }