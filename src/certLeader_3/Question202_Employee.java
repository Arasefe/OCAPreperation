package certLeader_3;

public class Question202_Employee {
    public int salary;
}

class Manager extends Question202_Employee {
    public int budget;
}
class Director extends Manager{
    public int stockOptions;
}

    class Tek{
        public static void main(String[] args) {
            Question202_Employee e=new Question202_Employee();
            Question202_Employee m=new Manager();
            Question202_Employee d=new Director();

            e.salary=50000;     // reference type decides which methods ad variables are accessible

            d.salary=55000;     // Object type decides which properties exist within the object memory
        }
    }