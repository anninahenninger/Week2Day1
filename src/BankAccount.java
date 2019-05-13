public class BankAccount {
    double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }
    public void addMoney(double money){
        this.balance += money;
    }
    public void withdrawMoney(double money){
        this.balance -= money;
    }
}
