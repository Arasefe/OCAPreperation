package certLeader;

public class _27CheckingAccount {
    public int amount;
    public _27CheckingAccount(){
        this.amount=100;
    }

}
class A{
    public static void main(String[] args) {
        _27CheckingAccount acc=new _27CheckingAccount();
        acc.amount=250;
        System.out.println(acc.amount);
    }
}
