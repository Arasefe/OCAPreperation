package ocaCybertek.set4;


public class Question15 {
    public void updatePrice(Producte producte,double price){
        price=price*2;                                  // 250
        producte.price=producte.price+price;            // 200+250
    }

    public static void main(String[] args) {
        Producte prt=new Producte();
        prt.price=200;
        double newPrice=125;

        Question15 t=new Question15();
        t.updatePrice(prt,newPrice);
        System.out.println(prt.price+":"+newPrice);
    }
}
class Producte{
    double price;
}