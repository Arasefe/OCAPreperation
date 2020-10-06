package entuware;

public class Question10 {
    Question10() {}
        public void print () {
            System.out.println("A");
        }

    public static void main(String[] args) {
        new B().print();
    }
    }

class B extends Question10{
    B(){
    }
    public void print(){
        System.out.println("B");
    }
}