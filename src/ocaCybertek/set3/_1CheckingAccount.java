package ocaCybertek.set3;

public class _1CheckingAccount {
    public int amount;

    public _1CheckingAccount(int amount){
        this.amount=amount;
    }
    public int getAmount(){
        return amount;
    }

    public void changeAmount(int x){
        amount+=x;
    }

    public static void main(String[] args) {
        _1CheckingAccount acct=new _1CheckingAccount(1000);
        System.out.println(acct.getAmount());
        acct.changeAmount(0);                   //1000
        acct.changeAmount(-acct.getAmount());   //0
        acct.amount=0;                          //0
        acct.changeAmount(-acct.getAmount());   //0

    }
}
