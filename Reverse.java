import java.util.Scanner;
public class Reverse
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
        int n=num, rem, rev=0;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("The reverse is"+rev);
    }
    public static void main()
    {
        Reverse obj=new Reverse();
        obj.input();
        obj.compute();
    }
}