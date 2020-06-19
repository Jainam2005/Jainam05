class Account
{
    double balance;
    Account()
    {
        balance=0;
    }
    void startAccount(double amt)
    {
        balance=amt;
    }
    void deposit(double amount)
    {
        balance+=amount;
    }
    void withdraw(double amount)
    {
        balance-=amount;
    }
    double getBalance()
    {
        return balance;
    }
    public static void main()
    {
        Account my_amount=new Account();
        my_amount.startAccount(5000.0);
        my_amount.deposit(1000.0);
        System.out.println("Current balance"+my_amount.getBalance());
        my_amount.withdraw(1000.0);
        System.out.println("Remaining balance"+my_amount.getBalance());
    }
}