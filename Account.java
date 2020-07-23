class Account
{
    double balance, Account_No;
    String name, type;
    Account()
    {
        balance=0;
        Account_No=0;
        name="";
        type="";
    }
    void startAccount(double amt, double acc, String name1, String type1)
    {
        balance=amt;
        Account_No=acc;
        name=name1;
        type=type1;
    }
    void deposit(double amount)
    {
        balance+=amount;
    }
    void withdraw(double amount)
    {
        if(balance>=amount)
        {
        balance-=amount;
        }
        else
        {
        System.out.println("Cannot Withdraw");
        }
    }
    void display()
    {
        System.out.println("The name is"+name);
        System.out.println("The account number is"+Account_No);
        System.out.println("The account type is "+type);
        System.out.println("The balance is"+balance);
    }
    public static void main()
    {
        Account my_amount=new Account();
        my_amount.startAccount(2000.0,1111.0,"Jainam","Savings");
        my_amount.deposit(0.0);
        my_amount.withdraw(2000.0);
        my_amount.display();
    }
}