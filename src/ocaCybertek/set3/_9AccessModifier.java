package ocaCybertek.set3;

import ocaCybertek.set2.Account;

public class _9AccessModifier extends Account {
    public static void main(String[] args) {
        _9AccessModifier acct=new _9AccessModifier();   // Child class object
        System.out.println(acct.s);
        System.out.println(acct.r);

        Account account=new Account();                  // Parent class object
        System.out.println(account.s);
    }
}
