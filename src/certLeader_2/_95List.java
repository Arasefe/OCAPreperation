package certLeader_2;

import java.util.ArrayList;
import java.util.List;

public class _95List {
    public static void main(String[] args) {
        List<Product> lst=new ArrayList<>();
        lst.add(new Product(10,"Ice Cream"));
        lst.add(new Product(11,"Chocolate"));
        Product p1=new Product(10,"Ice Cream");
        System.out.println(lst.indexOf(p1));
    }
}
