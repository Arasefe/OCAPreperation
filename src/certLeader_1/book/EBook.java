package certLeader_1.book;

interface Downloadable{
    public void download();
}
interface Readable extends Downloadable{
    public void readBook();
    public void download();
}

abstract class Book implements Readable{
    public void readBook(){
        System.out.println("Read Book");
    }
}


public class EBook extends Book{
    public void readBook(){
        System.out.println("Read E-Book");
    }

    public void download(){
        System.out.println("Downloading from ...");
    }
}
