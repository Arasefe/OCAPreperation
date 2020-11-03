package certLeader_2;

import java.awt.print.Book;

public class _159PassByValueObject {
    int count;
    public void method(Booker x, int k){
        x.pages=100;
        k=200;
    }

    public static void main(String[] args) {
        _159PassByValueObject obj=new _159PassByValueObject();
        Booker objBook=new Booker();
        System.out.println(objBook.pages+":"+obj.count);
        obj.method(objBook,obj.count);
        System.out.println(objBook.pages+":"+obj.count);
    }
}
class Booker{
    int pages;
}