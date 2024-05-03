package bankAccEx;

public class SavingsAccount extends  BankAccount {
    public SavingsAccount(String accountNUmber, double balance) {
        super(accountNUmber, balance);
    }
//modifikimii i metodes me chils nese duam te bejme nje ndryshim tek metoda kryesore

    @Override
    void withdraw(double amount) {
        if(getBalance()-amount<100){
            System.out.println("Minimum balance $100 required!");
        }else{
            super.withdraw(amount);
        }
    }
}
