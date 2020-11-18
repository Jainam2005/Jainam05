import java.util.Scanner;
public class Magic
{
    int num;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void checkMagic()
    {
        int sum=0, n=num;
        while(n>9)
        {
            sum=n;
            int s=0;
            while(sum!=0)
            {
                s=s+(sum%10);
                sum=sum/10;
            }
            n=s;
        }
        if(n==1)
        {
            System.out.println("It is a Magic Number");
        }
        else
        {
            System.out.println("It is not a Magic Number");
        }
    }
    public static void main()
    {
        Magic obj=new Magic();
        obj.input();
        obj.checkMagic();
    }
}