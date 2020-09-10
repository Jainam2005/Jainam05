import java.util.Scanner;
public class Menu
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
        System.out.println("1. Check whether or not number is a Palindrome Number");
        System.out.println("2. Check whether or not number is a Perfect Number");
    }
    void findPalindrome()
    {
        int rem, rev=0, temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(rev==num)
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
    }
    void findPerfect()
    {
        int sum=0, n=num;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(num==sum)
        {
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Menu obj=new Menu();
        obj.input();
        char choice;
        int opt;
        do
        {
            obj.generateMenu();
            System.out.println("Enter your selection[1/2]:");
            opt=sc.nextInt();
            if(opt==1)
            {
                obj.findPalindrome();
            }
            else if(opt==2)
            {
                obj.findPerfect();
            }
            else
            {
                return;
            }
            System.out.println("Would you like to continue[y/n]?");
            choice=(sc.next()).charAt(0);
        }while(choice=='y');
    }
}