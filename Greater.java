import java.util.Scanner;
public class Greater
{
    double num1, num2, num3, greatest;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=sc.nextDouble();
        System.out.println("Enter the second number");
        num2=sc.nextDouble();
        System.out.println("Enter the third number");
        num3=sc.nextDouble();
    }
    void compute()
    {
        if(num1>num2 && num1>num3 && num1>0)
        {
            greatest=num1;
            System.out.println("The greatest number is"+greatest);
        }
        else if(num2>num1 && num2>num3 && num2>0)
        {
            greatest=num2;
            System.out.println("The greatest number is"+greatest);
        }
        else if(num3>num1 && num3 >num2 && num3>0)
        {
            greatest=num3;
            System.out.println("The greatest number is"+greatest);
        }
        else
        {
            System.out.println("Zero value is not allowed");
        }
    }
    public static void main()
    {
        Greater obj=new Greater();
        obj.input();
        obj.compute();
    }
}