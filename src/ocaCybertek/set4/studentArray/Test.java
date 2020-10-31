package ocaCybertek.set4.studentArray;

public class Test {
    public static void main(String[] args) {
        Student[]students=new Student[3];

        students[0]=new Student("Aras");
        students[1]=new Student("Tulpar");

        for(Student each:students){
            System.out.println(each);
        }
    }
}
