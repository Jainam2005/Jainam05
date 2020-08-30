import java.util.Scanner;
public class Armstrong
{
    int num;
    void readNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void checkArmstrong()
    {
        int n=num;
        int digit=1, sum=0;
        while(n!=0)
        {
            digit=n%10;
            sum=sum+digit*digit*digit;
            n=n/10;
        }
        if(num==sum)
        {
            System.out.println("The number is an armstrong number");
        }
        else
        {
            System.out.println("The number is not an armstrong number");
        }
    }
    public static void main()
    {
        Armstrong obj=new Armstrong();
        obj.readNumber();
        obj.checkArmstrong();
    }
}