/*4.Using the switch statement. write a menu driven program to calculate the maturity amount of a Bank Deposit.
The user is given the following options:
(i) Term Deposit
(ii) Recurring Deposit
For option (i) accept principal(P), rare of ¡interest(r) and time period in years(n). Calculate 
and output the maturity amount(A) receivable using the formula
 

For option (ii) accept Monthly Installment (P), rate of interest(r) and time period in months 
(n). Calculate and output the maturity amount(A) receivable using the formula
 

For an incorrect option, an appropriate error message should be displayed.*/
import java.util.Scanner;
public class BoardQuestion4
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        System.out.println("Press any integer other than 1/2 to exit");
    }
    void Term_Deposit()//Method which will calculate Term Deposit
    {
        double P, r, n, A;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal");
        P=sc.nextDouble();
        System.out.println("Enter the Rate of Interest");
        r=sc.nextDouble();
        System.out.println("Enter the Time Period in Years");
        n=sc.nextDouble();
        A=P*Math.pow((1+r/100), n);
        System.out.println("The Maturity Amount receivable is"+A);
    }
    void Recurring_Deposit()//Method which will calculate Recurring Deposit
    {
        double P, r, n, A;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Monthly Installment");
        P=sc.nextDouble();
        System.out.println("Enter the Rate of Interest");
        r=sc.nextDouble();
        System.out.println("Enter the Time Period in Months");
        n=sc.nextDouble();
        A=((P*n)+(P*(n*(n+1)/2.0)*(r/100.0)*(1/12.0)));
        System.out.println("The Maturity Amount receivable is"+A);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        BoardQuestion4 obj=new BoardQuestion4();
        char choice;
        int opt;
        do
        {
            obj.generateMenu();
            System.out.println("Enter your selection[1/2]:");
            opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                obj.Term_Deposit();
                break;
                case 2:
                obj.Recurring_Deposit();
                break;
                default:
                System.out.println("Invalid choice");
                return;
            }
            System.out.println("Would you like to continue[y/n]?");
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}