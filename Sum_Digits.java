import java.util.Scanner;
public class Sum_Digits
{
    int num;
    void readNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void digitSum()
    {
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
        Sum_Digits obj=new Sum_Digits();
        obj.readNumber();
        obj.digitSum();
    }
}