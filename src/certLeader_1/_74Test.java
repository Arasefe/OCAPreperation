package certLeader_1;

public class _74Test {
    void readCard(int cardNo) {
        System.out.println("reading card");
    }
    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Checking card");
    }

    public static void main(String[] args) {
        _74Test ex=new _74Test();
        int cardNo=12344;
        ex.readCard(cardNo);        // reading card
        ex.checkCard(cardNo);       // checking card
    }
}
