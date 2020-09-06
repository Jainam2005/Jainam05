import java.util.Scanner;
public class Palindrome
{
    int num;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void compute()
    {
        int rem, rev=0, temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println("The reverse of the number is"+rev);
        if(rev==num)
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
    }
    public static void main()
    {
        Palindrome obj=new Palindrome();
        obj.input();
        obj.compute();
    }
}