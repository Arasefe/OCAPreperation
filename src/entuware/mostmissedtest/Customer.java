package entuware.mostmissedtest;

public class Customer {
    ElectricAccount account=new ElectricAccount();
    public void useElectricity(double kWh){
        account.addKWh(kWh);
    }
}
class ElectricAccount{
    private double kWh;
    private double rate=0.07;
    private double bill;

    public void addKWh(double kWh){
        this.kWh=kWh;
        this.bill=this.kWh*rate;
    }
}