import java.util.Scanner;
public class BinaryDecimal
{
    int num;
    void readNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void Binary_To_Decimal()
    {
        double decimalNumber=0;
        int i=0, n=num, rem;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            decimalNumber=decimalNumber+rem*Math.pow(2,i);
            ++i;
        }
        System.out.println("The decimal number is"+decimalNumber);
    }
    public static void main()
    {
        BinaryDecimal obj=new BinaryDecimal();
        obj.readNumber();
        obj.Binary_To_Decimal();
    }
}