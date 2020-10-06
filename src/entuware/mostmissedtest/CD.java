package entuware.mostmissedtest;

public class CD {
    int r;
    CD(int r){
        this.r=r;
    }
}

class DVD extends CD{
    int c;
    DVD(int r, int c){
        super(3);
        this.c=c;
    }

    public static void main(String[] args) {
        DVD dvd=new DVD(10,20);

    }
}