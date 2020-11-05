package certLeader_1;

public class _47ClassA { }

class ClassB extends _47ClassA{ }

class ClassC extends ClassB{
    public static void main(String[] args) {
        _47ClassA obj1= new ClassB();
        ClassB obj2= new ClassC();
        ClassC obj3= (ClassC)new _47ClassA();
        ClassC obj4= (ClassC)obj2;
    }

}
