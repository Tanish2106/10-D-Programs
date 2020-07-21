public class BankAccount
{
    double balance;
    public void startAccount( double amt)
    {
        balance = amt;
    }
    public void deposit( double amount )
    {
        balance += amount;
    }
    public void withdraw( double amount )
    {
        balance -= amount;
        
    }
    public double getBalance()
    {
        return balance;
    }
}
class AccountDemo
{
    public static void main(String args[])
    {
        BankAccount my_account = new BankAccount();
        my_account.startAccount(1000);
        my_account.deposit(250.00);
        System.out.println("Current Balance" + my_account.getBalance());
        my_account.withdraw(80.00);
        System.out.println("Remaining Balance" + my_account.getBalance());
    }
}