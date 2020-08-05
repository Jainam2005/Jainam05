import java.util.Scanner;
public class Swap
{
    double num1, num2;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=sc.nextDouble();
        System.out.println("Enter the second number");
        num2=sc.nextDouble();
    }
    void Compute()
    {
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
    }
    void display()
    {
        System.out.println("After swapping, num1 is:"+num1);
        System.out.println("After swapping, num2 is:"+num2);
    }
    public static void main()
    {
        Swap obj=new Swap();
        obj.input();
        obj.Compute();
        obj.display();
    }
}