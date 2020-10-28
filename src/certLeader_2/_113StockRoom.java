package certLeader_2;

public class _113StockRoom {
    static private int stock=10;
    static private int qty=5;
    static public void purchase(int qty){
        stock+=qty;
    }
    static public void sell(int qty){
        stock-=qty;
    }
    public void printStock(String action){
        System.out.println(action+" : "+qty+" items.stock in hand:"+ stock);
    }

    public static void main(String[] args) {
        _113StockRoom k1=new _113StockRoom();
        k1.sell(5);
        k1.printStock("Sold");
        _113StockRoom k2=new _113StockRoom();
        k2.purchase(5);
        k2.printStock("Purchased");
    }




}
