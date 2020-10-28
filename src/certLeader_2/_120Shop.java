package certLeader_2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class _120Shop {
    public static void main(String[] args) {
        Cart c=new Cart();
        System.out.println(c.p+" : "+c.totalAmount);
    }
}
class Cart{
    Producer p;
    double totalAmount;
}

class Producer{
    String name;
    double price;

    public Producer(String name, double price){
        this.name=name;
        this.price=price;
    }
}