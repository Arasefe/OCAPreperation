package certLeader_2;

public class Question159PassByValueObject {
    int count;
    public void method(Book x, int k){
        x.pages=100;
        k=200;
    }

    public static void main(String[] args) {
        Question159PassByValueObject obj=new Question159PassByValueObject();
        Book objBook=new Book();
        System.out.println(objBook.pages+":"+obj.count);
        obj.method(objBook,obj.count);
        System.out.println(objBook.pages+":"+obj.count);
    }
}
class Book{
    int pages;
}