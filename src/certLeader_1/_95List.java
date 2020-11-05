package certLeader_1;


import java.util.ArrayList;
import java.util.List;

public class _95List {
    public static void main(String[] args) {
        List<Product> list=new ArrayList<>();
        list.add(new Product(10,"IceCream"));
        list.add(new Product(11,"Chocolate"));
        Product p1=new Product(12,"Grape");
        System.out.println(list.indexOf(p1));

    }
}
class Product{
    int id;
    String name;
    Product(int id, String name){
        this.id=id;
        this.name=name;
    }
}