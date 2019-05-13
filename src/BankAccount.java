public class BankAccount {

    double balance;

    public BankAccount(double balance) {

        this.balance = balance;
    }

    public void addMoney(double money) {
        if(money == 0){
            System.out.println("You can't add 0 to your account!");
        } else if (money < 0) {
            System.out.println("You can't add a negative number to your account!");
        } else {
            this.balance += money;
            System.out.println("The amount of " + money + " has been added to your bank account. Your new balance is " + this.balance);
        }
    }


    public void withdrawMoney(double money){


        if(this.balance < money) {
            System.out.println("You can not withdrawl more money than your current balance wich is " + this.balance);
            //this.balance = 0;
        }

        else {
            this.balance -= money;
            //this.balance = this.balance - money;
            System.out.println("The amount of " + money + " has been withdrew from your bank account. Your new balance is " + this.balance);
        }
    }

    public void printBalance(){
        System.out.println(this.balance);
    }
}
