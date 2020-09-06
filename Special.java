import java.util.Scanner;
public class Special
{
    int num;
    void readNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void findSpecial()
    {
        int sum=0;int temp=num;
        while(temp!=0)
        {
            int a=temp%10;
            int fact=1;
            for(int i=1;i<=a;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println(num+" is a Special Number.");
        }
        else
        {
            System.out.println(num+" is not a Special Number.");
        }
    }
    public static void main()
    {
        Special obj=new Special();
        obj.readNumber();
        obj.findSpecial();
    }
}