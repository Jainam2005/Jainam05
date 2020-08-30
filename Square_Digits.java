import java.util.Scanner;
public class Square_Digits
{
    int num;
    void readNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void digitSquare()
    {
        int n=num;
        int digit=1;
        double sum=0;
        while(n!=0)
        {
            digit=n%10;
            sum=sum+Math.pow(digit,2);
            n=n/10;
        }
        System.out.println("The sum of the squares of the digits of the number is"+sum);
    }
    public static void main()
    {
        Square_Digits obj=new Square_Digits();
        obj.readNumber();
        obj.digitSquare();
    }
}