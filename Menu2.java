import java.util.Scanner;
public class Menu2
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Calculate first 10 terms of fibonacci series");
        System.out.println("2. Calculate the sum of digits of an integer that is input");
        System.out.println("Press any integer other than 1/2 to exit");
    }
    void calcFibonacci()
    {
        int a=0, b=1;
        System.out.print(a+"," +b+",");
        for(int i=1;i<=8;i++)
        {
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
        System.out.println();
    }
    void calcIntegerDigitSum()
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        num=sc.nextInt();
        int n=num;
        int digit=1, sum=0;
        while(n!=0)
        {
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("The sum of the digits in the number is"+sum);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Menu2 obj=new Menu2();
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
                obj.calcFibonacci();
                break;
                case 2:
                obj.calcIntegerDigitSum();
                break;
                default:
                return;
            }
            System.out.println("Would you like to continue[y/n]?");
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}