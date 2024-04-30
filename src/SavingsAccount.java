public class SavingsAccount{
    double balance;
    double withdraw;
    public SavingsAccount(double startingBalance){
        balance = startingBalance;
    }
    public void deposit(double amountToDeposit){
        double balanceAfterDeposit = balance + amountToDeposit;
        balance = balanceAfterDeposit;
    }
    public void withdraw(double amountToWithdraw){
        withdraw = amountToWithdraw;
        double balanceAfterWithdrawl = balance - amountToWithdraw;
        balance = balanceAfterWithdrawl;
    }
    public void greetCustomer(String customer){
        System.out.println("Hello, " + customer + "!");
    }
    public static void main(String [] args){
        SavingsAccount myAccount = new SavingsAccount(300.00);
        myAccount.greetCustomer("Celeste");
        System.out.println("Your starting balance is $" +myAccount.balance);
        myAccount.deposit(55.00);
        System.out.println("You have just deposited $" + myAccount.balance);
        myAccount.withdraw(75.00);
        System.out.println("You have just withdrawn an amount of $ " +myAccount.withdraw + ". "  +"Your new balance is $" +myAccount.balance);

    }
}