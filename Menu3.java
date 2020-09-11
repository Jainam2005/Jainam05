import java.util.Scanner;
public class Menu3
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Check whether or not number is a Buzz Number");
        System.out.println("2. Print GCD of two numbers");
        System.out.println("Press any integer other than 1/2 to exit");
    }
    void checkBuzz()
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        num=sc.nextInt();
        int n=num;
        if(n%10==7 || n%7==0)
        {
            System.out.println("It is a Buzz Number");
        }
        else
        {
            System.out.println("It is not a Buzz Number");
        }
    }
    void findGCD()
    {
        int num1, num2, hcf=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=sc.nextInt();
        System.out.println("Enter the second number");
        num2=sc.nextInt();
        for(int i=1;i<=num1;i++)
        {
            if((num1%i==0)&&(num2%i==0))
            {
                hcf=i;
            }
        }
        System.out.println("The GCD is"+hcf);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Menu3 obj=new Menu3();
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
                obj.checkBuzz();
                break;
                case 2:
                obj.findGCD();
                break;
                default:
                return;
            }
            System.out.println("Would you like to continue[y/n]?");
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}