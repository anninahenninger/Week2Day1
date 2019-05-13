/**
 * Create BankAccount class
 *
 * It has an account balance and methods to add and withdraw money, as well as to print account balance.
 *
 *     Create the class and its constructor.
 *
 *     Create a constructor that sets initial amount of money to the account.
 *
 *     demonstrate how it works by adding and  withdrawing money and printing results.
 *
 *     Improve your system by adding a notice printed in console when an account has gone into minus after some
 *     transaction.
 *
 *     INTERMEDIATE: Prevent user from going into a minus.
 *
 *     INTERMEDIATE: Prevent your colleagues from making mistake of calling your methods for adding money
 *     while calling it with a negative number (smth like addMoney(-100)
 *
 *     ADVANCED: search in internet “What is the best way of storing money in Java”. Discuss with group
 *     why floats and doubles are actually a bad idea, and what are BigIntegers.
 */
public class A002_BankAccount {

    public static void main(String[] args){

        BankAccount bankaccount1 = new BankAccount(2000);
        BankAccount bankaccount2 = new BankAccount(1000000);
        BankAccount bankaccount3 = new BankAccount(50000);

        bankaccount1.addMoney(2000);
        bankaccount1.withdrawMoney(50);
        bankaccount1.printBalance();

        bankaccount2.withdrawMoney(500000);
        bankaccount2.printBalance();

        bankaccount3.addMoney(15000);
        bankaccount3.printBalance();

        bankaccount1.withdrawMoney(2500);
        bankaccount1.printBalance();
        bankaccount1.withdrawMoney(1460);
        bankaccount1.printBalance();

        bankaccount2.addMoney(200);
        bankaccount2.printBalance();
        bankaccount2.withdrawMoney(150);
        bankaccount2.printBalance();


    }
}
