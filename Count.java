import java.util.Scanner;
public class Count
{
    int num;
    void readNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void digitCount()
    {
        int n=num;
        int count=0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }
        System.out.println("The number of digits in the number is"+count);
    }
    public static void main()
    {
        Count obj=new Count();
        obj.readNumber();
        obj.digitCount();
    }
}