import java.util.Scanner;
public class Sum
{
    double num1, num2, sum;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=sc.nextDouble();
        Scanner sb=new Scanner(System.in);
        System.out.println("Enter the second number");
        num2=sb.nextDouble();
    }
    void compute()
    {
        sum=num1+num2;
    }
    void display()
    {
        System.out.println("The sum is"+sum);
    }
    public static void main()
    {
        Sum obj=new Sum();
        obj.input();
        obj.compute();
        obj.display();
    }
}