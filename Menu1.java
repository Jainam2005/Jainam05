import java.util.Scanner;
public class Menu1
{
    int num;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }   
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1. Check whether or not number is a Prime Number");
        System.out.println("2. Check whether or not number is a Automorphic Number");
    }
    void findPrime()
    {
        int n=num, count=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
    void findAutomorphic()
    {
        int sq=num*num;
        int c=0, copy=num;
        while(copy>0)
        {
            c++;
            copy=copy/10;
        }
        int end=sq%(int)Math.pow(10,c);
        if(num==end)
        {
            System.out.println("It is an automorphic number");
        }
        else
        {
            System.out.println("It is not an automorphic number");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Menu1 obj=new Menu1();
        obj.input();
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
                obj.findPrime();
                break;
                case 2:
                obj.findAutomorphic();
                break;
                default:
                break;
            }
            System.out.println("Would you like to continue[y/n]?");
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}